import java.util.Scanner;

public class Uri1003{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int A, B, SOMA;

        // Entrada - Ler os valores A e B
        A = teclado.nextInt();
        B = teclado.nextInt();

        // Processamento 
        SOMA = A + B;

        // Exibir saida
        System.out.println("SOMA = " + SOMA);
    }
}