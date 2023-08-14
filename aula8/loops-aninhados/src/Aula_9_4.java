import java.util.Scanner;
public class Aula_9_4 {

    public static void main(String[] args) {
        final int tamanhoVetores = 4;

        int vetor[] =  new int[tamanhoVetores];
        int maiorValor = 0;

        Scanner scanner = new Scanner(System.in);

        for(int contador = 0; contador < tamanhoVetores; contador++) {
            System.out.println("digite o numero do vetor inserido : ");
            vetor[contador] = scanner.nextInt();
        }
        for (int contador = 0; contador < tamanhoVetores; contador++){
            if( vetor [contador] > maiorValor){
                System.out.println(maiorValor);
            }

        }



    }
}
