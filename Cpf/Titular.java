package Cpf;

public class Titular {
    private String nome;
    private CPF cpf;


    public Titular(String nome, String cpf) {
        this.nome = nome;
        this.cpf = new CPF(cpf);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf.getCpf();
    }

    public void setCpf(String cpf) {
        if(!this.cpf.temCpf()){
            if(this.cpf.isCPF(cpf)){
                this.cpf.setCpf(cpf);
            }else{
                System.out.println("Errado");
                cpf = null;
            }
        }else{
            System.out.println("O cpf ja foi setado");
        }
    }


}