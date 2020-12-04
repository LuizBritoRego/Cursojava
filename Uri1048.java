import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double salario, nsalar, reajuste;
        int percent;
        
        // Entrada - Ler os valores A e B
        salario = teclado.nextDouble();
       
          // Processamento 
        if (salario <= 400.0){
            percent = 15;
            reajuste = salario * 0.15;
            nsalar = salario + reajuste;
        }
        else if (salario <= 800.0){
            percent = 12;
            reajuste = salario * 0.12;
            nsalar = salario + reajuste;
        }
        else if (salario <= 1200.0){
            percent = 10;
            reajuste = salario * 0.10;
            nsalar = salario + reajuste;
        }
        else if (salario <= 2000.0){
            percent = 7;
            reajuste = salario * 0.07;
            nsalar = salario + reajuste;
        }
         else {
            percent = 4;
            reajuste = salario * 0.04;
            nsalar = salario + reajuste;
         }
        System.out.printf("Novo salario: %.2f%n", nsalar);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percent +" %");
    }
}	