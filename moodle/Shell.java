package moodle;

import java.util.Scanner;

public class Shell {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double acumulador = 0.0;
        
        while (true) {
            String comando = ler.nextLine();
            String[] vetor = comando.split(" ");
            System.out.println("$"+ comando);
            if(vetor[0].equals("show")){
                System.out.printf("%.2f ",acumulador);
            }
            else if(vetor[0].equals("addm")){
                for(int i = 1; i < vetor.length; i++){
                    acumulador += Double.parseDouble(vetor[i]);
                }
            }
            else if (vetor[0].equals("mult")){
                acumulador *= Double.parseDouble(vetor[1]);
            }
            else if (vetor[0].equals("add")){
                acumulador += Double.parseDouble(vetor[1]);
            }
            else if(vetor[0].equals("div")){
               if(Double.parseDouble(vetor[1]) != 0){
                    acumulador /= Double.parseDouble(vetor[1]);
                }
                else{
                    System.out.println("fail: division by zero");
                    }
            }
            else if (vetor[0].equals("end")){
               break;
            }
            else{
               break;
            }
           
        }
    }
}