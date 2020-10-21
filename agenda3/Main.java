import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(0);
        Scanner ler = new Scanner(System.in);
        while(true){
            String comando = ler.nextLine();
            String[] partes = comando.split(" ");
            System.out.println("$"+ comando);
            if(partes[0].equals("init")){
                agiota = new Agiota(Integer.parseInt(partes[1]));
            }
            else if(partes[0].equals("addCli")){
                agiota.addCliente(partes[1], Integer.parseInt(partes[2]));
            }else if(partes[0].equals("lend")){
                agiota.emprestar(partes[1], Integer.parseInt(partes[2]));
            }else if(partes[0].equals("receive")){
                agiota.receive(partes[1], Integer.parseInt(partes[2]));
            }else if(partes[0].equals("show")){
                System.out.println(agiota.toString());
            }else if(partes[0].equals("kill")){
                agiota.kill(partes[1]);
            }else{
                break;
            }
        }
    }
}