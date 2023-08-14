import java.util.Scanner;

public class Aula_10_2 {
    public static void main(String[] args) {

        final int quantidadeLinhas = 4;
        final int quantidadeColunas = 4;

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[quantidadeColunas][quantidadeColunas];


        for (int linhas = 0; linhas < quantidadeLinhas; linhas++) {
            for (int colunas = 0; colunas < quantidadeColunas; colunas++) {
              if (colunas % 2 != 0) {
                    System.out.println("digite o numero nas colunas impares");
                    matriz[linhas][colunas] = scanner.nextInt();
                }
            }
        }

        for(int linha = 0; linha < quantidadeLinhas; linha++) {
            for (int coluna = 0; coluna < quantidadeColunas; coluna++) {
                System.out.print("|" + matriz[linha][coluna] + "|" );
            }
        System.out.print("\n");
        }
    }
}
