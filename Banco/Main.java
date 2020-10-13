package Banco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(0, 0, 0);
        Scanner ler = new Scanner(System.in);
        while(true){
            String comando = ler.nextLine();
            String[] partes = comando.split(" ");
            //System.out.println("$"+ comando);
            if(partes[0].equals("init")){
                conta  = new Conta(Integer.parseInt(partes[1]), Integer.parseInt(partes[2]), Integer.parseInt(partes[3]));
            }else if(partes[0].equals("setData")){
                conta.data.setData(Integer.parseInt(partes[1]), Integer.parseInt(partes[2]), Integer.parseInt(partes[3]));
            }else if(partes[0].equals("retrocederData")){
                conta.data.retrocederData();
            }else if(partes[0].equals("mostrarData")){
                conta.data.mostrar();
            }
        }
    }
}