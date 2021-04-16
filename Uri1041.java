import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        Double x;
        Double y;

        //entrada
        //System.out.println("Informe os numeros");
        x = teclado.nextDouble();
        y = teclado.nextDouble();
      
        //processamento
        if (x == 0 && y == 0){
            System.out.println("Origem");
        } 
        else if (x == 0 && y != 0){
            System.out.println("Eixo Y");
        }
        else if (x != 0 && y == 0){
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
    }                        
}