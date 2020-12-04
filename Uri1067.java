import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int valor;

        valor = teclado.nextInt();

        for (int cont=1; cont <= valor; cont +=2){
          //  if (valor % 2 != 0){
                System.out.println(cont);
          // }
        }
    }
}