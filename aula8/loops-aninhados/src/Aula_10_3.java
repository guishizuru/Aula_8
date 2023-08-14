import java.util.Scanner;
public class Aula_10_3 {
    public static void main(String[] args) {
        final int quantidadeLinhas = 5;
        final int quantidadeColunas = 5;

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[quantidadeColunas][quantidadeLinhas];

        for (int linhas = 0; linhas < quantidadeLinhas; linhas ++) {
            for (int colunas = 0; colunas < quantidadeColunas; colunas ++)
            if( linhas == colunas ){
                System.out.println("digite os numros : ");
                matriz[colunas][linhas] = scanner.nextInt();
            }
        }

        for (int linhas = 0; linhas < quantidadeLinhas; linhas += 2) {
            for (int colunas = 0; colunas < quantidadeColunas; colunas += 2) {
                System.out.print( "| " + matriz[linhas][colunas] + "|");

            }
            System.out.print("\n");

        }
    }
}
