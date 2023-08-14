import java.util.Scanner;
public class Aula_9_10 {
    public static void main(String[] args) {
        final int quantidadeVetores = 10;

        int vetor[] = new int[quantidadeVetores];
        int variavelTesteemPar = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o indice do vetor, se for par, será adicionado no vetor:");
        int valorDigitado = scanner.nextInt();


        System.out.println("digite agora o valor a ser adicionado:");

            variavelTesteemPar = scanner.nextInt();

            if (variavelTesteemPar % 2 == 0){
                vetor[variavelTesteemPar] = valorDigitado;

            }
        System.out.println( vetor[variavelTesteemPar]);



        //}

    }
}