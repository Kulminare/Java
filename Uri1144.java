import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: Squared and Cubic
       
        int valor;
        int linhas = 0;
        int a = 1;
        int b = 1;
        int c = 1;
        
        valor = teclado.nextInt();
        
        while (linhas < valor){
            System.out.println(a + " " + b + " " + c);
            b++;
            c++;
            System.out.println(a + " " + b + " " + c);
            linhas++;
            a++;
            b = a * a;
            c = a * b;
        }
    }                        
}