import java.util.Scanner;
public class Uri1038v3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod, qtd;
        double total = 0;

       
        // Exemplo de acumulo de valores (ver exerccio no git)

        do {
        System.out.println("Por favor digite o codigo do seu produto");
        cod = teclado.nextInt();
        switch(cod){
            case 0:
                System.out.println("Segue o total do seu pedido ", total);
                break;
            case 1:
                System.out.printf("Total: R$ %.2f%n",qtd * 4.0);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f%n",qtd * 4.5);
                break;
            case 3:
                 System.out.printf("Total: R$ %.2f%n",qtd * 5.0);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f%n",qtd * 2.0);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f%n",qtd * 1.5);
                break;
            default:
                System.out.println("Produto nao cadastrado");
                break;
        }
    }
}