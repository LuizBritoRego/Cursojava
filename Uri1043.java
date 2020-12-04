import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        float A, B, C;
        float RES;
        
        // Entrada - Ler os valores A e B
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();
  
        // Processamento 
        if ( (A + B > C) || (A + C > B) || (B + C > A)){
            RES = A + B + C;
            System.out.println("Perimetro = " + RES);
        }
        else{ 
            RES = ((A + B) * C ) / 2;
            System.out.println("Area = " + RES);
        }
    }
}