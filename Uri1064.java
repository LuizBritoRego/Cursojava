import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        float valor, soma=0;
        int qtdePositivos=0;
        double media = 0.0;

        for (int cont=1; cont <=6; cont ++){
            valor = teclado.nextFloat();
            if (valor > 0){
                qtdePositivos++;
                soma = soma + valor;
            }
        }
        media = (soma / qtdePositivos);
        System.out.println(qtdePositivos +" valores positivos");
        System.out.printf("%.1f%n", media);
    }
}