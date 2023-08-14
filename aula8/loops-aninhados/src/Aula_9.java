import java.sql.SQLOutput;
import java.util.Scanner;
public class Aula_9 {
    public static void main(String[] args) {

        final int quantidadedeValores = 10;

        double numeros[] = new double [quantidadedeValores];
        double somatorio = 0.0;

        Scanner scanner = new Scanner(System.in);

        for (int contador = 0; contador < quantidadedeValores; contador++){
            System.out.println("digite o numero " + (contador + 1) + ":");
            numeros[contador] = scanner.nextInt();
            somatorio = somatorio + numeros[contador];
        }

        double media = somatorio / quantidadedeValores;
        System.out.println("A media é:" + media);


        scanner.close();

    }
}
