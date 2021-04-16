import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: PUM
       
        int valor;
        int linhas = 0;
        int a = 1;
        int b = 2;
        int c = 3;
        
        valor = teclado.nextInt();

        while (linhas < valor){
            System.out.println(a + " " + b + " " + c + " PUM");
            //System.out.println(a);
            //System.out.println(b);
            //System.out.println(c);
            linhas++;
            a+=4;
            b+=4;
            c+=4;
        }
    }                        
}