import java.util.Scanner;
public class Leituras{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int a;
        float b;
        double c;

        System.out.println("Por favor digite um valor inteiro ");
        a = teclado.nextInt();
        System.out.println("Você digitou " + a);

        System.out.println("Por favor digite um valor Float ");
        b = teclado.nextFloat();
        System.out.println("Você digitou " + b);

        System.out.println("Por favor digite um valor Double ");
        c = teclado.nextDouble();
        System.out.println("Você digitou " + c);

        System.out.printf("%.1f%n", c);
        System.out.printf("%.2f%n", c);
        System.out.printf("%.3f%n", c);
    }
}