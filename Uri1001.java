import java.util.Scanner;

public class Uri1001{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int A, B, X;

        //entrada
        //System.out.println("Informe o valor de A");
        A = teclado.nextInt();
        //System.out.println("Informe o valor de B");
        B = teclado.nextInt();
    
        //processamento
        X = A + B;
        
        //saida
        System.out.println("X = " + X);
    
    }
}