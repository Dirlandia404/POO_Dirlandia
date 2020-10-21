import java.util.ArrayList;
public class Trampolim {
    ArrayList<Kid> kidsWaiting = new ArrayList<Kid>();
    ArrayList<Kid> kidsPlaying = new ArrayList<Kid>();

    public void chegou(Kid kid){
        kidsWaiting.add(kid);
    }

    public void entrar() {
        kidsPlaying.add(kidsWaiting.get(0));
        kidsWaiting.remove(0);
    }
    
    public void sair(){
        kidsWaiting.add(kidsPlaying.get(0));
        kidsPlaying.remove(0);
    }

    public String show() {
        String print = "=> ";
        for(int i = kidsWaiting.size() - 1; i >= 0; i--){
            print += kidsWaiting.get(i);
        }
        print += "=> [ ";
        for(int i = kidsPlaying.size() - 1; i >= 0 ; i--){
            print += kidsPlaying.get(i);
        }
        print += "]";
        return print;
    }
    
}
