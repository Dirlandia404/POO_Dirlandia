public class Kid {
    private String nome;
    private int idade;


    public Kid(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return this.nome + ":" + this.idade +  " ";
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }


}