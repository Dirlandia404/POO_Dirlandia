package cinema;


public class Cliente {
    private String id;
    private String fone;

    public Cliente(String id, String fone) {
        this.id = id;
        this.fone = fone;
    }

    public String toString() {
        return getId() +":"+ getFone();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public boolean compararID(String id){
        if(id.equals(this.id)){
            return true;
        }
        return false;
    }

}