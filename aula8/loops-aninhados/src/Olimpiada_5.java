import java.util.Scanner;

public class Olimpiada_5 {
    public static void main(String[]args) {

        final int  quantidaVetores = 10;
        int vetor[] = new int [quantidaVetores];
        int paraTestedePar = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" digite a quantidade de vetores : ");
        int valordigitado = scanner.nextInt();

        System.out.println(" digite o valor a ser adicionado");
        paraTestedePar =  scanner.nextInt();

        if(paraTestedePar % 2 == 0) {
            vetor[paraTestedePar] = valordigitado;
        }

        System.out.println(vetor[paraTestedePar]);








    }
}
