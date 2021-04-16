import java.util.Scanner;

public class testandodowhile{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor = 1;

        
       

        do {
            System.out.println("Valor = "+valor);
            valor = valor +1;
        } while( valor <= 10);
        }
    }                        
}