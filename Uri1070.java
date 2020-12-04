import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int valor;

        valor = teclado.nextInt();
        if (valor % 2 == 0){
            valor ++;
        }

        for (int cont=1; cont <= 6; cont ++){
            System.out.println(valor);
            valor = valor +2;
        }
    }
}