
import java.util.Scanner;
public class Aula_9_2{

        public static void main(String[] args) {

            final int quantidadeValores = 6;
            int numeros[] = new int[quantidadeValores];

            int contador = 0;

            Scanner scanner = new Scanner(System.in);

            while(contador < quantidadeValores) {
                int numeroDigitado;
                System.out.println(" digite o " + (contador + 1) + "° numero");
                numeroDigitado = scanner.nextInt();

                if (numeroDigitado % 2 == 0) {
                    numeros[contador] = numeroDigitado;
                    System.out.println("numero par " + numeroDigitado);

                } else {
                        numeros[contador] = numeroDigitado;
                        System.out.println(" numero impar " + numeroDigitado);

                }

                contador = contador + 1 ;
            }

        }
    }
