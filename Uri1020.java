import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        

        int idade, anos, meses, dias;
        
        
        
        idade = teclado.nextInt();
   
        
        anos = idade / 365;
        meses = (idade % 365) / 30;
        dias = idade - (anos * 365 + meses * 30);

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");         
    }
}