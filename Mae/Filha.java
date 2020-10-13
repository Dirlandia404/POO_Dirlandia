public class Filha extends Mae {
    protected int exemplo;
    protected int getExemplo(){
        return this.exemplo;
    }
    protected void setExemplo(int x){
        this.exemplo = x;
    }
}
// com o atributo protected apenas o filho pode alterar seu atributos