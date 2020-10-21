import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    Trampolim trampolim = new Trampolim();
    Scanner ler = new Scanner(System.in);
        while(true){
            String comando = ler.nextLine();
            String[] partes = comando.split(" ");
            System.out.println("$"+ comando);
            if(partes[0].equals("chegou")){
               trampolim.chegou(new Kid(partes[1], Integer.parseInt(partes[2])));
            }else if(partes[0].equals("show")){
                System.out.println(trampolim.show());
            }else if(partes[0].equals("entrar")){
                trampolim.entrar();
            }else if(partes[0].equals("sair")){
                trampolim.sair();
            }else{
                break;
            }
        }
    ler.close();
    }
}
