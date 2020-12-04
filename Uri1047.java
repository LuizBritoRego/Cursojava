import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int hI, hF, mI, mF, dH, dM, tempoI, tempoF, dur;
        
        // Entrada - Ler os valores A e B
        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();
       
          // Processamento 
        tempoI = hI * 60 + mI;
        tempoF = hF * 60 + mF;

        dur = tempoF - tempoI;

        if (dur <= 0){
            dur = dur + 24*60;
        }
        dH = dur / 60;
        dM = dur % 60;
        System.out.println("O JOGO DUROU "+dH+" HORA(S) E "+dM+" MINUTO(S)");
    }
}