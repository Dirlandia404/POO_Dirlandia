import java.util.ArrayList;
public class Agiota {
    private int nextTrId = 0;
    private float balance;
    private ArrayList<Cliente> repCliente = new ArrayList<Cliente> ();
    private ArrayList<Transaction> repTrans = new ArrayList<Transaction>(); 
    

    public void pushTransacao(String name, float value){
        repTrans.add(new Transaction(nextTrId, name, value));
        nextTrId++;
    }
    public Agiota(float saldoInicial){
        this.balance = saldoInicial;
    }

    public void addCliente(String name, float limite){
        for(Cliente cliente : repCliente){
            if(name.equals(cliente.name)){
                System.out.println("failure: cliente ja existe");
                return;
            }
        }
        Cliente x = new Cliente(name, limite);
        repCliente.add(x);
    }
    
    public void emprestar(String name, float valor){
        if(valor > this.balance){
            System.out.println("fail: fundos insuficientes");
            return;
        }
        boolean eleExiste = false;
        Cliente cli = new Cliente("", 0);
        for(Cliente cliente : repCliente){
            if(cliente.name.equals(name)){
                eleExiste = true;
                cli = cliente;
            }
        }
        if(!eleExiste){
            System.out.println("fail: cliente nao existe");
            return;
        }
        if(cli.balance + valor > cli.limite){
            System.out.println("fail: limite excedido");
            return;
        }
        cli.balance += valor;
        this.balance -= valor;
        pushTransacao(name, valor);
    }
    public void receive(String name, float valor){
        for(Cliente cliente : repCliente){
            if(cliente.name.equals(name)){
                if(cliente.balance < valor){
                    System.out.println("fail: valor maior que a divida");
                    return;
                }
                cliente.balance -= valor;
                balance += valor;
                pushTransacao(name, -valor);
                return;
            }
        }
    }
    public void kill(String name){
        for(Cliente cliente : repCliente){
            if(cliente.name.equals(name)){
                repCliente.remove(cliente);
                for(Transaction trans : repTrans){
                    if(trans.name.equals(name)){
                        repTrans.remove(trans);
                        if(repTrans.size() ==  0){
                            return;
                        }
                    }
                }
                return;
            }
        }
    }

    public String toString(){
        String print = "clients:\n";
        for(Cliente cliente : repCliente){
            print += cliente;
        }
        print += "transactions:\n";
        for(Transaction trans : repTrans){
            print += trans;
        }        
        print += "balance: "+ balance;
        return print;
    }






    public int getNextTrId() {
        return this.nextTrId;
    }

    public void setNextTrId(int nextTrId) {
        this.nextTrId = nextTrId;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public ArrayList<Cliente> getRepCliente() {
        return this.repCliente;
    }

    public void setRepCliente(ArrayList<Cliente> repCliente) {
        this.repCliente = repCliente;
    }

    public ArrayList<Transaction> getRepTrans() {
        return this.repTrans;
    }

    public void setRepTrans(ArrayList<Transaction> repTrans) {
        this.repTrans = repTrans;
    }
    

}
/*
init 500
addCli maria 500 
addCli josue 60
addCli maria 300
lend maria 300
lend josue 50
lend maria 100
show
lend bruno 30
end maria 60
lend josue 30
show
receive maria 1000
receive maria 350
receive josue 1
receive maria 10
show
kill maria
*/