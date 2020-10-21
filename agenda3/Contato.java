import java.util.ArrayList;
public class Contato{
    private String name;
    private ArrayList<Fone> fones = new ArrayList<Fone> ();
    private boolean favorito;


    public Contato(String id) {
        this.name = id;
    }




    public void addFone(String label, String number){

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Fone> getFones() {
        return this.fones;
    }

    public void setFones(ArrayList<Fone> fones) {
        this.fones = fones;
    }

    public boolean isFavorito() {
        return this.favorito;
    }

    public boolean getFavorito() {
        return this.favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
}
