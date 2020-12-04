import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        double valorx=0.0;
        double valory=0.0;
        
        // Entrada - Ler os valores A e B
        valorx = teclado.nextDouble();
        valory = teclado.nextDouble();
  
        // Processamento 
        if ( (valorx == 0) && (valory == 0)){
            System.out.println("Origem");
        }
        else if ( (valorx > 0) && (valory > 0)){
            System.out.println("Q1");
        }
        else if ( (valorx < 0 ) && (valory > 0)){
            System.out.println("Q2");
        }
        else if ( (valorx < 0) && (valory < 0)){
            System.out.println("Q3");
        }
        else if ( (valorx > 0) && (valory < 0)){
            System.out.println("Q4"); 
        }
        else if ( (valorx == 0) && (valory != 0)){
            System.out.println("Eixo Y"); 
        }
        else if ( (valorx != 0) && (valory == 0)){
            System.out.println("Eixo X"); 
        }
    }
}