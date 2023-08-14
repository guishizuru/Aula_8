
import java.util.Scanner;
public class Aula_9_3 {
    public static void main(String[] args) {
        final int tamanhoVetores = 5 ;

        int vetor[] = new int[tamanhoVetores];
        int vetor2[]= new int[tamanhoVetores];

        Scanner scanner = new Scanner(System.in);

        for(int contador = 0; contador < tamanhoVetores; contador++){
            System.out.println(" digite o numero 1 vetor :");
            vetor[contador] = scanner.nextInt();

            System.out.println(" digite o numero 2 vetor :");
             vetor2[contador] = scanner.nextInt();
        }
        int vetor3[] = new int [tamanhoVetores];
        for (int contador = 0; contador < tamanhoVetores; contador ++) {
            vetor3[contador] = vetor[contador] + vetor2[contador];
        }
        for (int contador = 0; contador < tamanhoVetores; contador ++){
            System.out.println(vetor3[contador] + "");
        }

    }
}
