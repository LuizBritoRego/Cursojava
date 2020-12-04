import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // Exercicio para testar senha fixa
        int combust, qtGasolina=0, qtAlcool=0, qtDiesel=0;

        // Processamento
        do{
            combust = teclado.nextInt();
            if ( combust == 1 ){
                qtAlcool ++;
            }
            else if ( combust == 2){                                     
                qtGasolina ++;
            }
            else if ( combust == 3){                                     
                qtDiesel ++;
            }      
        } while ( combust != 4 );
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " +qtAlcool);
        System.out.println("Gasolina: " +qtGasolina);
        System.out.println("Diesel: " +qtDiesel);
    }
}