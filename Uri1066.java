import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int valor;
        int qtdePares=0, qtdeImpares=0, qtdeNeg=0, qtdePos=0;

        for (int cont=1; cont <=5; cont ++){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                qtdePares++;
            }
            else{
                qtdeImpares++;
            }
            if (valor > 0){
                qtdePos++;
            }
            else {if (valor < 0){
                    qtdeNeg++;
                }
            }
        }
        System.out.println(qtdePares +" valor(es) par(es)");
        System.out.println(qtdeImpares +" valor(es) impar(es)");
        System.out.println(qtdePos +" valor(es) positivo(s)");
        System.out.println(qtdeNeg +" valor(es) negativo(s)");

    }
}