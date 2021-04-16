import java.util.Scanner;

public class switchcase{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor;
       
        //entrada - switch case
        //System.out.println("Informe os numeros");
        valor = teclado.nextInt();

        //processamento
        switch(valor){
            case 1:
                System.out.println("digitou o valor 1");
            case 2:
                System.out.println("digitou o valor 2");
            case 3:
                System.out.println("digitou o valor 3");
            default:
                System.out.println("digitou outro valor");
        }
    }
}                        
