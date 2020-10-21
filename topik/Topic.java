import java.util.ArrayList;

public class Topic{
    private int qtdAcentos;
    private int qtdPref;
    private ArrayList<Passageiro> acentos = new ArrayList<Passageiro>();

    public Topic(int qtdAcentos, int qtdPref) {
        this.qtdAcentos = qtdAcentos;
        this.qtdPref = qtdPref;
        for(int i = 0; i < qtdAcentos; i++){
            acentos.add(null);
        }
    }

    private boolean estaNaTopic(String nome){
        for(int i = 0; i < qtdAcentos; i++){
            if(acentos.get(i) != null && acentos.get(i).getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }

    public void addPass(String nome){
        if(estaNaTopic(nome)){
            System.out.println("fail: pass ja esta na topic");
        }else{
            System.out.println("fail: pass nao esta na topic");
        }

    }

    public void addPass(String nome, int idade){
        if(estaNaTopic(nome)){
            System.out.println("fail: pass ja esta na topic");
        }
        if(idade > 65){
            for(int i = 0; i < qtdAcentos; i++){
                if(acentos.get(i) == null){
                    acentos.set(i ,new Passageiro(nome, idade));
                    return;
                }
            }
        }else{
            for(int i = qtdPref; i < qtdAcentos;i++){
                if(acentos.get(i) == null){
                    acentos.set(i ,new Passageiro(nome, idade));
                    return;
                }
            }
            for(int i = 0; i < qtdAcentos;i++){
                if(acentos.get(i) == null){
                    acentos.set(i ,new Passageiro(nome, idade));
                    return;
                }
            }
        }
        System.out.println("fail: topic lotada");
    }

    public void remover(String nome){
        for(int i = 0; i < qtdAcentos; i++){
            if(acentos.get(i) != null && acentos.get(i).getNome().equals(nome)){
                acentos.set(i, null);
                return;
            }
        }
        System.out.println("fail: pass nao esta na topic");
    }

    public String toString() {
        String tostring = "[ ";
        for(int i = 0; i < qtdAcentos; i++){
            if(i < qtdPref){
                if(acentos.get(i) != null){
                    tostring += "@"+ acentos.get(i).toString() +" ";
                }else{
                    tostring += "@ ";
                }
            }else{
                if(acentos.get(i) != null){
                    tostring += "="+ acentos.get(i).toString() +" ";
                }else{
                    tostring += "= ";
                }
            }
        }
        tostring += "]";
        return tostring;
    }
}

