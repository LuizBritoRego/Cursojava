public class Continhas{
    public static void main(String args[]){
        int a, b, c;
        a = 11;
        b = 4;
        System.out.println("Valor das variáveis a=" + a + "  b=" + b);
        c = a + b;
        System.out.println("Resultado da soma " + c);
        c = a - b;
        System.out.println("Resultado da subtração " + c);    
        c = a * b;
        System.out.println("Resultado da multiplicação " + c); 
        c = a / b;
        System.out.println("Resultado da divisão " + c); 
        c = a % b;
        System.out.println("Resto da divisão " + c); 
        float f;
        f = (float)a/b;
        System.out.println("Restultado da divisão com prescisão " + f);
        f = 11f/b;
        System.out.println("Restultado da divisão com prescisão(2) " + f);
    }
}
