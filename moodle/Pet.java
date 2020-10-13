package moodle;
import java.util.Scanner;


class Pet {
  private int energiaMAX = 1, saciedadeMAX = 1, limpezaMAX = 1;
  private int energia = 1, saciedade = 1, limpeza = 1;
  private int diamantes = 0;
  private int idade = 0;
  private boolean vivo = true; 

  public Pet(int energiaMAX, int saciedadeMAX, int limpezaMAX) {
    this.energiaMAX = energiaMAX;
    this.saciedadeMAX = saciedadeMAX;
    this.limpezaMAX = limpezaMAX;
    energia = energiaMAX;
    saciedade = saciedadeMAX;
    limpeza = limpezaMAX;
  }

  public void dormir() {
    // O Comando "$sleep" aumenta energia até o máximo e idade aumenta do número de
    // turnos que o pet dormiu. Os outros atributos permanecem inalterados.
    if (this.energia > energiaMAX - 5) {
      System.out.println("fail: nao esta com sono");
    } else {
      idade += energiaMAX - energia;
      energia = energiaMAX;
      this.saciedade -= 1;
    }
    
  }

  public void comer() {
    // O Comando "$eat" altera em -1 a energia, +4 a saciedade, -2 a limpeza, +0
    // diamantes, +1 a idade
    if (this.energia >= energiaMAX) {
      System.out.println("Seu pet está de buxo cheim");
    } else {
      this.energia -= 1;
      this.saciedade += 4;
      this.limpeza -= 2;
      this.idade += 1;
      limites();
    }
  }

  public void brincar() {
    // altera em -2 energia, -1 saciedade, -3 limpeza, +1 diamante, +1 idade.
    this.energia -= 2;
    this.saciedade -= 1;
    this.limpeza -= 3;
    this.diamantes += 1;
    this.idade += 1;
    limites();
  }

  public void banhar() {
    // O comando "$clean" alteram em -3 energia, -1 na saciedade, MAX na limpeza, +0
    // diamantes, +2 na idade.
    if (this.limpeza >= limpezaMAX) {
      System.out.println("seu pet tá limpinho");
    } else {
      this.energia -= 3;
      this.saciedade -= 1;
      this.limpeza = limpezaMAX;
      this.idade += 2;
      limites();
    }
  }

  public boolean testarvida() {
    if (energia <= 0 || saciedade <= 0 || limpeza <= 0) {
      vivo = false;
    }
    if (vivo == false) {
      System.out.println("fail: pet esta morto");
      return false;
    }
    return true;
  }

  public void limites(){
    if(energia > energiaMAX){
        energia = energiaMAX;
    }else if(energia <= 0){
        System.out.println("fail: pet morreu de fraqueza");
        energia = 0;
    }
    if(saciedade > saciedadeMAX){
        saciedade = saciedadeMAX;
    }else if(saciedade <= 0){
      System.out.println("fail: pet morreu de fome");
      saciedade = 0;
    }
    if(limpeza >limpezaMAX){
      limpeza = limpezaMAX;
    }else if(limpeza <= 0){
        System.out.println("fail: pet morreu de sujeira");
        limpeza = 0;
    }
  }

  public String toString() {
    return ("E:" + this.energia + "/" + energiaMAX + ", " + "S:" + this.saciedade + "/" + saciedadeMAX + ", " + "L:"
        + this.limpeza + "/" + limpezaMAX + ", " + "D:" + this.diamantes + ", " + "I:" + this.idade + "\n");
  }
  public int getEnergia() {
    return this.energia;
  }
  public void setEnergia(final int energia) {
    this.energia = energia;
  }
  public int getSaciedade() {
    return this.saciedade;
  }
  public void setSaciedade(final int saciedade) {
    this.saciedade = saciedade;
  }
  public int getLimpeza() {
    return this.limpeza;
  }
  public void setLimpeza(final int limpeza) {
    this.limpeza = limpeza;
  }
}
public class Tamagotchi {
    public static void main(String[] args) {
        Pet pet = new Pet(0,0,0);
        Scanner ler = new Scanner(System.in);
        while(true){
          String comando = ler.nextLine();
          String[] partes = comando.split(" ");
          System.out.println("$"+ comando);
          if(partes[0].equals("init")){
            int energia,saciedade, limpeza;
            energia = Integer.parseInt(partes[1]);
            saciedade = Integer.parseInt(partes[2]);
            limpeza = Integer.parseInt(partes[3]);
            pet = new Pet(energia, saciedade, limpeza);
          }else if(partes[0].equals("show")){
            System.out.printf(pet.toString());
          }else if(partes[0].equals("play")){
              if(pet.testarvida()) {pet.brincar();}
          }else if(partes[0].equals("eat")){
            if(pet.testarvida()) {pet.comer();}
          }else if(partes[0].equals("sleep")){
              if(pet.testarvida()) {pet.dormir();}
          }else if(partes[0].equals("clean")){
            if(pet.testarvida()) {pet.banhar();}
          }else if(partes[0].equals("end")){
            break;
          }
          else{
    		System.out.println("Comando invalido");
    	  }
        }
    }
    
}