import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: valores pares

        int qtde = 0;
        int numero;
        int resto;
        //float total = 0;
        //float media = 0;
        
        for (int contador = 1; contador <= 5; contador = contador + 1){
            numero = teclado.nextInt();
            resto = numero % 2;
            if (resto == 0){
                qtde = qtde + 1;
            }
        }
        System.out.println(qtde+ " valores pares");
    }                        
}