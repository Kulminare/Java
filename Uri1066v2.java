import java.util.Scanner;

public class Uri1066v2{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: valores pares, impares, positivo, negativo

        int numero;
        int resto = 0;
        int pares = 0;
        int impares = 0;
        int positivo = 0;
        int negativo = 0;
      
        for (int contador = 1; contador <= 5; contador ++){
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                pares++;
            }
            else { 
                impares++;
            }

            if (numero > 0){
                positivo++;
            }
            else if (numero < 0){
                negativo++;
            }
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }                        
}