package cinema;
import java.util.ArrayList;

public class Cinema {
    ArrayList<Cliente> cadeiras = new ArrayList<Cliente>();

    public Cinema(int qtd) {
        for(int i = 0; i < qtd; i++){
            cadeiras.add(new Cliente(null, null));
        }
    }
    
    public void reservar(String id, String fone, int lugar) {
        if(lugar >= (cadeiras.size())){
            System.out.println("esse lugar não existe");
            return;
        }else if(cadeiras.get(lugar).getId() != null){
            System.out.println("failure: cadeira ja esta ocupada");
            return;
        }
        else{
            for(Cliente cliente : cadeiras){
                if(id.equals(cliente.getId())){
                    System.out.println("failure: cliente ja esta no cinema");
                    return;
                }
            }
        }
        Cliente x = new Cliente(id, fone);
        cadeiras.set(lugar, x);
    }

    public void cancelar(String id) {
        boolean bandeira = false;
        int i = 0;
        for(Cliente cliente : cadeiras){
            if(cliente.compararID(id)){
                Cliente x = new Cliente(null, null);
                cadeiras.set(i, x);
                bandeira = true;
            }
            i++;
        }
        if(!bandeira){
            System.out.println("Cliente não existe!");
        }
    }

    public void MostrarCadeiras() {
        System.out.printf("[ ");
        for(Cliente cliente : cadeiras){
            if(cliente.getId() != null){
                System.out.printf(cliente.toString()+" ");
            }else{
                System.out.printf("- ");
            }
        }
        System.out.println("]");
    }
}