import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        double A, B, C, MEDIA;

        // Entrada - Ler os valores A e B
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // Processamento 
        MEDIA  = (A * 2.0 + B * 3.0 + C * 5.0) / 10;

        // Exibir saida
        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}
