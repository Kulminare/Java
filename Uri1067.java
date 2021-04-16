import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: valores Impares
        int numero;
        int resto = 0;
        
        numero = teclado.nextInt();

        for (int contador = 1; contador <= 1000 && contador <= numero; contador = contador + 1){
            resto = contador % 2;
            //System.out.println(contador);
            //System.out.println(resto);
            if (resto != 0){
              System.out.println(contador);
            }   
        }
        //System.out.println(pares+ " valor(es) par(es)");
    }                        
}