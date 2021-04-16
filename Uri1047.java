import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int iH;
        int iM;
        int fH;
        int fM;
        int tempo;
        int horas;
        int minutos;
        

        //entrada - Game in Minutes
        //System.out.println("Informe os numeros");
        iH = teclado.nextInt();
        iM = teclado.nextInt();
        fH = teclado.nextInt();
        fM = teclado.nextInt();

        //processamento
        
        //if (fH == iH){
        //    fH = fH + 24;
        //}
        //horas = fH - iH;

        horas = fH - iH;
        if (fH <= 0){
            horas = horas + 24;
        }
        
        if (fM < iM){
            fM = fM + 60;
        }
        minutos = fM - iM;

        //saida
        System.out.println("O JOGO DUROU "+horas+" HORA(S) E "+minutos+" MINUTO(S)");
    }                             
       
}                        
