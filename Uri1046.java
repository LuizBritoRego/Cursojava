import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int hI, hF, dur;
        
        // Entrada - Ler os valores A e B
        hI = teclado.nextInt();
        hF = teclado.nextInt();
       
          // Processamento 

        dur = hF - hI;

        if (dur <= 0){
            dur = dur + 24;
        }
        System.out.println("O JOGO DUROU "+dur+" HORA(S)");
    }
}