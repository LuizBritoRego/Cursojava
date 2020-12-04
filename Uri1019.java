import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int ENT, HORA, MIN, SEG, SOBRA;

        // Entrada - Ler os valores A e B
        ENT = teclado.nextInt();

        // Processamento 
        HORA = (ENT / 3600);
        SOBRA = (ENT % 3600);
        MIN = (SOBRA / 60);
        SEG = (SOBRA % 60);

        // Exibir saida
        System.out.println(HORA + ":" + MIN + ":" + SEG);
    }
}