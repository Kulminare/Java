import java.util.Scanner;

public class Uri1070v2{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: 6 numeros impares.valores Impares
        int numero;
        int resto = 0;
        
        xxxxxxx
        numero = teclado.nextInt();

        //resto = numero % 2;

        if (numero % 2 == 0){
            nu
        }
        
        for (int contador = 1; contador <= 6; contador++){
            resto = numero % 2;
            //System.out.println(contador);
            //System.out.println(resto);
            if (resto != 0){
              System.out.println(numero);
              numero = numero + 2;
            }
               else { 
                   numero = numero + 1;  
                   System.out.println(numero);
                   numero = numero + 2; 
                }   
        }
        //System.out.println(pares+ " valor(es) par(es)");
    }                        
}