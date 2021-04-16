import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        float sal;
        float novosal;
        float dif;
        int p4;
        int p7;
        int p10;
        int p12;
        int p15;

        p4 = 4;
        p7 = 7;
        p10 = 10;
        p12 = 12;
        p15 = 15;
     
      
        //entrada - Rejuste salario.
        System.out.println("Informe o Salario");
        sal = teclado.nextFloat();
              
        //processamento
        if (sal > 2000){
            novosal = (sal * 104) / 100;
            dif = novosal - sal;
            System.out.printf("Novo Salario: %.2f\n", novosal);
            System.out.printf("Reajuste Ganho: %.2f\n", dif);
            System.out.printf("Em percentual: %d %\n", p4);
        } 
       else {
           if (sal > 1200 && sal <= 2000){
               novosal = (sal * 107) / 100;
               dif = novosal - sal;
               System.out.printf("Novo Salario: %.2f\n", novosal);
                System.out.printf("Reajuste Ganho: %.2f\n", dif);
                System.out.printf("Em percentual : %d\n", p7);
           }
           else {
               if (sal > 800 && sal <= 1200){
                    novosal = (sal * 110) / 100;
                    dif = novosal - sal;
                    System.out.printf("Novo Salario: %.2f\n", novosal);
                    System.out.printf("Reajuste Ganho: %.2f\n", dif);
                    System.out.printf("Em percentual : %d\n", p10);
           }
                else {
                     if (sal > 400 && sal <= 800){
                        novosal = (sal * 112) / 100;
                        dif = novosal - sal;
                        System.out.printf("Novo Salario: %.2f\n", novosal);
                        System.out.printf("Reajuste Ganho: %.2f\n", dif);
                        System.out.printf("Em percentual : %d\n", p12);
                }
                    else {
                        if (sal > 0 && sal <= 400){
                        novosal = (sal * 115) / 100;
                        dif = novosal - sal;
                        System.out.printf("Novo Salario: %.2f\n", novosal);
                        System.out.printf("Reajuste Ganho: %.2f\n", dif);
                        System.out.printf("Em percentual : %d\n", p15);
                    }
                }
           }
           }
       }   
    }                    
}                             
                       
