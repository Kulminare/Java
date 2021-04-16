import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        

        //entrada - Game.
        //System.out.println("Informe os numeros");
        hi = teclado.nextInt();
        hf = teclado.nextInt();
      
        //processamento
        tempo = hf - hi;

        if (tempo <= 0){
            tempo = tempo + 24;
        }
        System.out.println("O JOGO DUROU "+tempo+" HORA(S)");
    }                             
       
}                        
