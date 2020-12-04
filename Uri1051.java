import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double salario, imposto;
        
        // Entrada - Ler os valores A e B
        salario = teclado.nextDouble();
       
          // Processamento 
        if (salario <= 2000.0){
            System.out.println("Isento");
        }
        else if (salario <= 3000.0){
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        else if (salario <= 4500.0){
            imposto = (salario - 3000) * 0.18 + 80.0;
            System.out.printf("R$ %.2f%n", imposto);
        }
         else {
            imposto = (salario - 4500) * 0.28 + 270.0 + 80.0;
            System.out.printf("R$ %.2f%n", imposto);
         }
    }
}