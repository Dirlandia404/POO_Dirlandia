package motoca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto(1);
        Scanner ler = new Scanner(System.in);
        while(true){
            String comando = ler.nextLine();
            String[] partes = comando.split(" ");
            System.out.println("$"+ comando);

            if(partes[0].equals("init")){
                moto = new Moto(Integer.parseInt(partes[1]));
            }else if(partes[0].equals("show")){
                System.out.println(moto.toString());
            }else if(partes[0].equals("buzinar")){
                System.out.println(moto.buzinar());
            }else if(partes[0].equals("in")){
                moto.subir(new Pessoa(partes[1], Integer.parseInt(partes[2])));
            }else if(partes[0].equals("buy")){
                moto.comprarTempo(Integer.parseInt(partes[1]));
            }else if(partes[0].equals("drive")){
                moto.dirigir(Integer.parseInt(partes[1]));
            }else{
                break;
            }
        }
    }
}
