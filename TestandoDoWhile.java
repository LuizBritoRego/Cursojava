import java.util.Scanner;

public class TestandoDoWhile{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int valor = 90;

        do{
            System.out.println("Valor = " + valor);
            valor = valor + 1;
         } while ( valor <= 100);
    }
}