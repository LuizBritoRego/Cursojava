import java.util.Scanner;

public class Uri1115{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        // Exercicio para testar senha fixa
        int valorX, valorY;

        // Processamento
        do{
            valorX = teclado.nextInt();
            valorY = teclado.nextInt();
            if ( (valorX > 0) && (valorY > 0)){
                System.out.println("primeiro");
            }
            else if ( (valorX < 0 ) && (valorY > 0)){
                System.out.println("segundo");
            }
            else if ( (valorX < 0) && (valorY < 0)){
                System.out.println("terceiro");
            }
            else if ( (valorX > 0) && (valorY < 0)){
                System.out.println("quarto"); 
            }            
         } while ( (valorX != 0) && (valorY != 0));
    }
}