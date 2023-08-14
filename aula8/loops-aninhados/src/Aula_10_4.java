import java.util.Random;
import java.util.Scanner;
public class Aula_10_4 {
    public static void main(String[] args) {
        final int quantidadeColunas = 3;
        final int quantidadeLinhas = 3;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[quantidadeColunas][quantidadeLinhas];

        for(int linhas = 0; linhas < quantidadeLinhas; linhas++){
            for(int colunas = 0; colunas < quantidadeColunas; colunas++){
                matriz[linhas][colunas] = random.nextInt(0,2);
            }
        }

        int linhaEscolhida;

        System.out.println(" Escreva a linha deseja vereficar :");
        linhaEscolhida = scanner.nextInt();

        int colunaEscolhida;

        System.out.println(" Escreva a coluna deseja  vereficar :");
        colunaEscolhida = scanner.nextInt() ;

         if(matriz[linhaEscolhida][colunaEscolhida] == 1){
             System.out.println("kabum");
         }else {
             System.out.println("ta vivo !");
        }


    }

}
