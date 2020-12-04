import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int valor, proximo;
        String parImpar, posNeg;

        valor = teclado.nextInt();

        for (int cont=1; cont <= valor; cont ++){
            proximo = teclado.nextInt();
            if (proximo % 2 == 0){
                parImpar = "EVEN";
            }
            else{
                parImpar = "ODD";
            }
            if (proximo > 0){
                posNeg = "POSITIVE";
            }
            else if (proximo < 0){
                posNeg = "NEGATIVE";   
            }
             else {
                posNeg = "NULL"; 
            }
            if (proximo == 0){
                System.out.println(posNeg);
            }
            else{
                System.out.println(parImpar + " " + posNeg);
            }
        }
    }
}