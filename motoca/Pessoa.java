package motoca;

public class Pessoa{
    public String nome = null;
    public int idade = 0;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return "[" + this.nome + ":" + this.idade + "]";
    }
    

}
