import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double a, b, media;

        //entrada
        //System.out.println("Informe a nota A");
        a = teclado.nextDouble();
        //System.out.println("Informe a anota B");
        b = teclado.nextDouble();
        
        //processamento
        media = (((a * 0.35) + (b * 0.75)) * 10 / 11);
        
        //saida
        System.out.printf("MEDIA = %.5f\n", media);
    
    }
}