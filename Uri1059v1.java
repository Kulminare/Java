import java.util.Scanner;

public class Uri1059v1{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        for (int numero=1; numero<=100; numero = numero + 1){
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }                        
}