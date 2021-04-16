import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: valores pares, impares, positivo, negativo

        int numero;
        int resto = 0;
        int pares = 0;
        int impares = 0;
        int positivo = 0;
        int negativo = 0;
      
        for (int contador = 1; contador <= 5; contador = contador + 1){
            numero = teclado.nextInt();
            resto = numero % 2;
            if (resto == 0){
                pares = pares + 1;
            }
            else { impares = impares + 1;}
            if (numero > 0){
                positivo = positivo + 1;
            }
            if (numero < 0){
                negativo = negativo + 1;
            }
        }
        System.out.println(pares+ " valor(es) par(es)");
        System.out.println(impares+ " valor(es) impar(es)");
        System.out.println(positivo+ " valor(es) positivo(s)");
        System.out.println(negativo+ " valor(es) negativo(s)");
    }                        
}