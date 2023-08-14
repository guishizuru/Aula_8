import java.util.Scanner;

public class Aula_12_4 {
    public static int piramide(int quantidade) {


        for (int altura = 0; altura <= quantidade; altura++) {
            for (int profundidade = quantidade; profundidade > altura; profundidade--) {
                    System.out.print("*");

            }
            System.out.println();
        }
        return quantidade;
    }

    public static void main(String[] args) {

        int quantidade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha a quantidade");
        quantidade = scanner.nextInt();

         piramide(quantidade);
    }
}