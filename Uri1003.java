import java.util.Scanner;

public class Uri1003{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double a, b, SOMA;

        //entrada
        System.out.println("Informe o valor de a");
        a = teclado.nextDouble();
        System.out.println("Informe o valor de b");
        b = teclado.nextDouble();
    
        //processamento
        SOMA = a + b;
        
        //saida
        System.out.printf("SOMA de a %.2f e altura %.2f vale %.2f\n", a, b, SOMA);
    
    }
}