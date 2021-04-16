import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
       

        int valor;
        int n100;
        int n50;
        int n20;
        int n10;
        int n5;
        int n2;
        int n1;
        
        
        
        valor = teclado.nextInt();
   
        
        n100 = valor / 100;
        n50 = (valor - (n100 * 100)) / 50;
        n20 = (valor - (n100 * 100 + n50 * 50)) / 20;
        n10 = (valor - (n100 * 100 + n50 * 50 + n20 * 20)) / 10;
        n5 = (valor - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10)) / 5;
        n2 = (valor - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10 + n5 * 5)) / 2;
        n1 = (valor - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10 + n5 * 5 + n2 * 2)) / 1;


        System.out.printf("%d\n", valor);      
        System.out.printf("%d notas(s) de R$ 100,00\n", n100);
        System.out.printf("%d notas(s) de R$ 50,00\n", n50); 
        System.out.printf("%d notas(s) de R$ 20,00\n", n20); 
        System.out.printf("%d notas(s) de R$ 10,00\n", n10); 
        System.out.printf("%d notas(s) de R$ 5,00\n", n5); 
        System.out.printf("%d notas(s) de R$ 2,00\n", n2); 
        System.out.printf("%d notas(s) de R$ 1,00\n", n1); 
         }
}