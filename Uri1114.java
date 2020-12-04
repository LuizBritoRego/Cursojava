import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        // Exercicio para testar senha fixa
        int senha;

        // Processamento
        do{
            senha = teclado.nextInt();
            if (senha == 2002){
                System.out.println("Acesso Permitido");
            }
            else{
                System.out.println("Senha Invalida");
            }                
         } while ( senha != 2002);
    }
}