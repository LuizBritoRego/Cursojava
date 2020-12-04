import java.util.Scanner;

public class TestandoIF{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        double A, B, MEDIA;

        // Entrada - Ler os valores A e B
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        // Processamento 
        MEDIA  = (A * 3.5 + B * 7.5) / 11;

        // Exibir saida
        System.out.printf("Sua média = %.5f%n", MEDIA);
        
        If ( MEDIA >= 7.0 ) {
            System.out.printf("Parabéns, você foi aprovado");
        }
        else {
           System.out.printf("Sentimos, mas você foi reprovado"); 
        }
    }
}