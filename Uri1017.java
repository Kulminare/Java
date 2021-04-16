import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        
        //double kml = 12;
        int hours;
        int kmh;
        double dist;
        double litros;
        
        
        hours = teclado.nextInt();
        kmh = teclado.nextInt();
        
        dist = hours * kmh;
        litros = dist / 12;

        System.out.printf("%.3f\n", litros);         
    }
}