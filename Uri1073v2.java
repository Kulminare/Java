import java.util.Scanner;

public class Uri1073v2{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: Raiz Quadrada
        int numero;
        int resto = 0;
        int total = 1;
        
        
        numero = teclado.nextInt();

        if (numero > 5 || numero < 2000){
            for (int cont = 2; cont <= numero; cont = cont + 2){
                //resto = numero % 2;
                total = cont * cont;
                System.out.println(cont + "^2 = " + total);
            }
        }
    }                        
}