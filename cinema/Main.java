package cinema;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(0);
        Scanner ler = new Scanner(System.in);
        while(true){
            String comando = ler.nextLine();
            String[] partes = comando.split(" ");
            System.out.println("$"+ comando);

            if(partes[0].equals("init")){
                cinema = new Cinema(Integer.parseInt(partes[1]));
            }else if(partes[0].equals("show")){
                cinema.MostrarCadeiras();
            }else if(partes[0].equals("reservar")){
                cinema.reservar(partes[1], partes[2], Integer.parseInt(partes[3]));
            }else if(partes[0].equals("cancelar")){
                cinema.cancelar(partes[1]);
            }else{
                break;
            }
        }
    }
}