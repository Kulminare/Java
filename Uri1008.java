import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int emp, hours;
        double amount, salary;

        //entrada
        System.out.println("Informe numero empregado");
        emp = teclado.nextInt();
        System.out.println("Informe qtd horas trabalhadas");
        hours = teclado.nextInt();
        System.out.println("Informe valor/hora");
        amount = teclado.nextDouble();
        
         
        //processamento
        salary = (hours * amount);
        
        //saida
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", emp, salary);
        //System.out.println("NUMBER = %d\n", emp);
        //System.out.printf("SALARY = US$ %.2f\n", salary);
    
    }
}