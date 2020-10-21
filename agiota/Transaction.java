public class Transaction {
    public int id;
    public String name;
    public float valor;


    public Transaction(int id, String name, float valor) {
        this.id = id;
        this.name = name;
        this.valor = valor;
    }
    public String toString() {
        return "- id:"+ id +" "+ this.name +":"+ this.valor +"\n";
    }
    
}
