package pet;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
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
      }else{
				System.out.println("Comando invalido");
			}
    }
  }
}