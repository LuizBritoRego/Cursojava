import java.util.Scanner;
public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod;
        String cid;

        cod = teclado.nextInt();
     
        switch(cod){
            case 11:
                System.out.prinln("Sao Paulo");
                break;
            case 19:
                System.out.prinln("Campinas");
                break;
            case 21:
                System.out.prinln("Rio de Janeiro");
                break;
            case 27:
                System.out.prinln("Vitoria");
                break;
            case 31:
                System.out.prinln("Belo Horizonte");
                break;
            case 32:
                System.out.prinln("Juiz de Fora");
                break;
            case 61:
                System.out.prinln("Brasilia");
                break;
            case 71:
                System.out.prinln("Salvador");
                break;
            default:
                System.out.prinln("DDD nao cadastrado");
                break;
        }
    }
}