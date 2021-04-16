import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        
        //double kml = 12;
        int horario;
        int hours;
        int minutes;
        int seconds;
        
        
        
        horario = teclado.nextInt();
   
        
        hours = horario / 3600;
        minutes = (horario % 3600) / 60;
        seconds = horario % 60;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);         
    }
}