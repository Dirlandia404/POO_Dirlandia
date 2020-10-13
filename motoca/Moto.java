package motoca;
public class Moto {
    public int potencia = 1;
    public int minutos = 0;
    public  Pessoa motorista = null;


    public Moto(int potencia) {
        this.potencia = potencia;
    }

    public void subir(Pessoa pass) {
        if(motorista == null){
            motorista = pass;
        }
        else{
            System.out.println("fail: moto ocupada");
        }
    }
    public Pessoa descer() {
        if(motorista != null){
            Pessoa auxiliar = motorista;
            motorista = null;
            return auxiliar;
        }
        else{
            System.out.println("fail: moto vazia");
            return null;
        }
    }
    public String buzinar() {
        if(this.motorista == null){
            return("fail: moto vazia"); 
        }
        else{
            String e = "";
            for(int i = 0; i < potencia; i++){
                e += "e";
            }
            return "p" + e + "m";
        }
    }

    public void comprarTempo(int minutos) {
        this.minutos += minutos;
    }

    public void dirigir(int minutos) {
        if(motorista == null){
            System.out.println("fail: moto vazia");
        }
        if(motorista.idade > 10){
            System.out.println("fail: muito grande para andar de moto");
        }
        else if(this.minutos == 0){
            System.out.println("fail: tempo zerado");
        }
        else if(this.minutos < minutos){
            System.out.println("fail: andou " + this.minutos + " min e acabou o tempo");
            this.minutos = 0;
        }else{
            this.minutos -= minutos;
        }
    }

    public String toString() {
        return "potencia: " + this.potencia + ", minutos: " + this.minutos + ", pessoa: " + this.motorista;
    }

}