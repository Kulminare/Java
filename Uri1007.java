import java.util.Scanner;

public class Uri1007{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int a, b, c, d, dif;

        //entrada
        System.out.println("Informe valor de A");
        a = teclado.nextInt();
        System.out.println("Informe valor de  B");
        b = teclado.nextInt();
        System.out.println("Informe valor de C");
        c = teclado.nextInt();
        System.out.println("Informe valor de D");
        d = teclado.nextInt();
         
        //processamento
        dif = ((a * b) - (c * d));
        
        //saida
        System.out.printf("DIFERENCA = %d\n", dif);
    
    }
}