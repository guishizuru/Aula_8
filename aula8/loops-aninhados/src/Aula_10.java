import java.util.Scanner;
public class Aula_10 {
    public static void main(String[] args) {


        final int quantidadeLinhas = 3;
        final int quantidadeconlunas = 3;
        int LinhaseColunas = 0;

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[quantidadeLinhas][quantidadeconlunas];


            for (int linha = 0; linha < quantidadeconlunas; linha++) {
                for (int coluna = 0; coluna < quantidadeLinhas; coluna++) {
                    System.out.println(" digite um numero para inserir :");
                    matriz[linha][coluna] = scanner.nextInt();
                }
            }
            for(int linha= 0;linha < quantidadeconlunas; linha++){
                for(int coluna = 0; coluna < quantidadeconlunas; coluna++){
                    System.out.print("|" + matriz[linha][coluna] + "|" +"\n" );
                }

            }



        }
    }
