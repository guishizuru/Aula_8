import java.util.Scanner;

public class Aula_12_3 {

    public static void main(String[] args) {
        int repostadaIdade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua idade");
        repostadaIdade = scanner.nextInt();

        verificarCategoria(repostadaIdade);

    }

    public static int verificarCategoria(int idade) {

        if (idade > 0 && idade <= 10) {
            System.out.println(" você é infantil");
        } else if (idade > 10 && idade <= 17) {
            System.out.println(" você é juvenil");
        } else if (idade >= 18) {
            System.out.println(" você é adulto");
        }else {
            System.out.println(" idade invalida");
        }return idade;

    }
}
