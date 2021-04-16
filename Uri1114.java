import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: Fixed Password
       
        int num;
        num = teclado.nextInt();

        while (num != 2002){
            System.out.println("Senha Invalida");
             num = teclado.nextInt();       }
        System.out.println("Acesso Permitido");
    }                        
}