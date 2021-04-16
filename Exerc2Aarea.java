import java.util.Scanner;
public class Exerc2Aarea{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float lado, area;

        //entrada
        System.out.println("Digite o valor do lado do quadrado");
        lado = input.nextFloat();

        //processamento
        area = lado * lado;

        //saida
        System.out.printf("O valor da área do quadrao vale %.3f\n", area);
    }
}