import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado;  //Scanner do teclado
        teclado = new Scanner(System.in);

        int ENT, ANO, MES, DIA, SOBRA;

        // Entrada - Ler os valores A e B
        ENT = teclado.nextInt();

        // Processamento 
        ANO = (ENT / 365);
        SOBRA = (ENT % 365);
        MES = (SOBRA / 30);
        DIA = (SOBRA % 30);

        // Exibir saida
        /* System.out.println("ENTRADA = " + ENT);   */
        System.out.println(ANO + " ano(s)");
        System.out.println(MES + " mes(es)");
        System.out.println(DIA + " dia(s)");
    }
}