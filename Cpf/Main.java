package Cpf;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular(" ", " ");
        Scanner ler = new Scanner(System.in);
        while(true){
            String comando = ler.nextLine();
            String[] partes = comando.split(" ");
            System.out.println("$"+ comando);
            if(partes[0].equals("init")){
                titular = new Titular(partes[1], partes[2]);
            }else if(partes[0].equals("setCPF")){
                titular.setCpf(partes[1]);
            }else if(partes[0].equals("getNome")){
                System.out.println(titular.getNome());
            }else if(partes[0].equals("getCPF")){
                System.out.println(titular.getCpf());
            }
        }
    }
}