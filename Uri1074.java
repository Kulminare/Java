import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: Even or Odd
        int cases;
        int cont = 1;
        int numero;
        int resto = 0;

         
        cases = teclado.nextInt();
         
        while (cont <= cases){
            numero = teclado.nextInt();
            resto = numero % 2;
            if (numero > 0 && resto == 0){
                System.out.println("EVEN POSITIVE");
            }
            else if (numero > 0 && resto != 0){
                System.out.println("ODD POSITIVE");
            }
            else if (numero < 0 && resto == 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if (numero < 0 && resto != 0){
                System.out.println("ODD NEGATIVE");
            }
            else if (numero == 0){
                System.out.println("NULL");
            }
           cont = cont + 1;        
        }
    }                        
}