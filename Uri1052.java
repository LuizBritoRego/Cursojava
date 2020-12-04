import java.util.Scanner;
public class Uri1052{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod;
        String cid=" ";

        cod = teclado.nextInt();
     
        if (cod == 1){  
            cid = "January";
        }
        else if (cod == 2){
            cid = "February";
        }
        else if (cod == 3){
            cid = "March";
        }
        else if (cod == 4){
            cid = "April";
        }
        else if (cod == 5){
            cid = "May";
        }
        else if (cod == 6){
            cid = "June";
         }
        else if (cod == 7){
            cid = "July";    
        }
        else if (cod == 8){
            cid = "August";  
        }
        else if (cod == 9){
            cid = "September";  
        }
        else if (cod == 10){
            cid = "October";  
        }
        else if (cod == 11){
            cid = "November"; 
        }
        else if (cod == 12){
            cid = "December";     
        }
        System.out.println(cid);
    }
}