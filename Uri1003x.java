import java.util.Scanner;

public class Uri1003x{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int a, b, SOMA;

        //entrada
        System.out.println("Informe o valor de a");
        a = teclado.nextInt();
        System.out.println("Informe o valor de b");
        b = teclado.nextInt();
    
        //processamento
        SOMA = a + b;
        
        //saida
        System.out.println("SOMA = " + SOMA);
    
    }
}