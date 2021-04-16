import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        // Entrada: Tipo de Combustivel
       
        int valor;
        int alc = 0;
        int gas = 0;
        int die = 0;
        
        valor = teclado.nextInt();

        while (valor != 4){
            if (valor == 1){
                alc++;
            }
            else if (valor == 2){
                gas++;
            }
            else if (valor == 3){
                die++;
            }
            //else if (valor != 4){
            //    System.out.println("Digite outro valor");
            //}
            valor = teclado.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);
        
        //       switch(valor){
        //   case 1:
        //        1Alc++1;
        //    case 2:
        //        2Gas++1;
        //    case 3:
        //        3Die++1;
        //    case 4:
        //        System.out.println("q????uarto");
         
    }                        
}