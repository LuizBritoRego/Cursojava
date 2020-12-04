import java.util.Scanner;

public class Uri1001{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int A, B, X;

        // Entrada - Ler os valores A e B
        A = teclado.nextInt();
        B = teclado.nextInt();

        // Processamento 
        X = A + B;

        // Exibir saida
        System.out.println("X = " + X);
    }
}