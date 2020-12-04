import java.util.Scanner;

public class Uri1007{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        double A, B, C, D, DIFERENCA;

        // Entrada - Ler os valores A e B
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        D = teclado.nextDouble();

        // Processamento 
        DIFERENCA  = ((A * B) - (C * D));

        // Exibir saida
        System.out.printf("DIFERENCA = %.0f%n", DIFERENCA);
    }
}