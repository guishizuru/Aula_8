import java.util.Scanner;
public class Aula_11 {
    public static void main(String[]args) throws InterruptedException {
        final int tamanhodaTabuleiro = 3;
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int [tamanhodaTabuleiro][tamanhodaTabuleiro];
        while(true) {
            int linhaEscolhida;
            System.out.println("digite a linha escolhida x :");
            linhaEscolhida = scanner.nextInt();

            int colunaEscolhida;
            System.out.println("digite a couluna escolhida x :");
            colunaEscolhida = scanner.nextInt();

            matriz[linhaEscolhida][colunaEscolhida] = 'x';


            System.out.println("digite a linha escolhida 0 :");
            linhaEscolhida = scanner.nextInt();


            System.out.println("digite a couluna escolhida 0 :");
            colunaEscolhida = scanner.nextInt();

            matriz[linhaEscolhida][colunaEscolhida] = '0';

            for( int linha = 0; linha < 10; linha++);{
                for( int coluna = 0; coluna < 10; coluna++);
                System.out.println(" | " + matriz[colunaEscolhida][linhaEscolhida] + " | ");
            }
            System.out.println("\n");

            Thread.sleep(10000);
        }



    }

}
