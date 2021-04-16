import java.util.Scanner;

public class Uri1144x{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: Squared and Cubic
       
                
        int N = teclado.nextInt();
        
        for (int num = 1; num <= N; num++){
            System.out.println(num + " " + (num*num) + " " + (num*num*num));
            System.out.println(num + " " + (num*num+1) + " " + (num*num*num+1));
        }
              
    }                        
}