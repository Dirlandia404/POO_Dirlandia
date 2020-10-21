public class Cliente {
    public String name;
    public float limite;
    public float balance;


    public Cliente(String name, float limite) {
        this.name = name;
        this.limite = limite;
    }
    
    public String toString() {
        return "- "+ this.name +":"+ this.balance + "/" + this.limite + "\n";
    }
    
}
