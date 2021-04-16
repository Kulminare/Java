import java.util.Scanner;

public class Uri1050{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int ddd;

        //entrada
        System.out.println("Informe o DDD");
        ddd = teclado.nextInt();
      
        //processamento
        if (ddd == 61){
            System.out.printf("Brasilia");
        } 
        else {
            if (ddd == 71){
                System.out.printf("Salvador");
            }
            else {
                if (ddd == 11){
                    System.out.printf("Sao Paulo");
                }
                else {
                        if (ddd == 21){
                            System.out.printf("Rio de Janeiro");
                        }
                        else {
                                if (ddd == 32){
                                    System.out.printf("Juiz de Fora");
                                }
                                else {
                                        if (ddd == 19){
                                            System.out.printf("Campinas");
                                        }
                                        else {
                                                if (ddd == 27){
                                                    System.out.printf("Vitoria");
                                                }
                                                else {
                                                     if (ddd == 31){
                                                            System.out.printf("Belo Horizonte");
                                                     }
                                                     else{
                                                                System.out.printf("Não Encontrado");
                                                     }
                                                 }        
                                        }           
                                }               
                        }                                                  
                }           
            }            
        }                             
            
         
        //saida
        //System.out.printf("MEDIA = %.5f\n", media);
    
    }
}