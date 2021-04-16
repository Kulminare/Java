import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        float a;
        float b;
        float c;
        float perimetro;
        float area;

        //entrada - Triangulo.
        //System.out.println("Informe os numeros");
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
      
        //processamento
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } 
        else {
            area = (((a + b) * c) / 2);
            System.out.printf("Area = %.1f\n", area); 
        }

    }                             
       
}                        
