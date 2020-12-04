import java.util.Scanner;
public class Uri1038v2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod, qtd;
        double total=0.0;

        cod = teclado.nextInt();
        qtd = teclado.nextInt();

        if (cod == 1){    // digitei codigo 1?
            total = qtd * 4.0;
        }
        else if (cod == 2){
            total = qtd * 4.50;
        }
        else if (cod == 3){
            total = qtd * 5.0;
        }
        else if (cod == 4){
            total = qtd * 2.0;
         }
         else{  // não é nem 1, nem 2, nem 3, nem 4 - só pode ser 5
            total = qtd * 1.50;
        } // fim do IF da linha 11
        System.out.printf("Total: R$ %.2f%n",total);
    }
}