package Banco;

public class Conta {
    public Data data = new Data(0, 0, 0);
    public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
 
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumconta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("---------------------------------");
    }
    
    public void abrirConta(final String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else {
            this.setSaldo(150);
        }

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");

        } else if (this.getSaldo() < 0) {
            System.out.println("Conta negativa");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(final float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado" + this.getDono());
        } else {
            System.out.println("Conta fechada");
        }
    }

    public void sacar(final float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("impossivel sacar");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Paga com sucesso");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("impossivel pagar");
        }
    }

    public Conta(int dia, int mes, int ano) {
        this.saldo = 0;
        this.status = false;
        this.data = new Data(dia, mes, ano);
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(final int numconta) {
        this.numconta = numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(final String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(final float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(final boolean status) {
        this.status = status;
    }

        
    
    
}
