import java.util.Scanner;
import java.util.Random;
public class Jokenpo_2 {

        public static void main(String[] args) {
            int pedra = 1;
            int papel = 2;
            int tesoura = 3;

            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.println(
                    "escolha um numero jogador 1 :   "
                            + "\n" + pedra + " - pedra"
                            +"\n" + papel + " - papel"
                            + "\n" + tesoura + " - tesoura"
            );

            int resposta = scanner.nextInt();

            while(resposta >= 4 || resposta <= 0) {
                resposta = scanner.nextInt();
            }

            if (resposta == pedra) {
                System.out.println(" Jogador 1 escolheu pedra "
                                    +"\n------------------------");
            } else if (resposta == papel) {
                System.out.println(" Jogador 1 escolheu papel "
                                    +"\n------------------------");
            }else if (resposta == tesoura) {
                System.out.println(" Jogador 1 escolheu tesoura "
                                    +"\n------------------------");
            }

            while(resposta >= 4 || resposta <= 0) {
                resposta = scanner.nextInt();
            }

            int resposta2 = random.nextInt(1, 4);

            if(resposta2 == pedra) {
                System.out.println(" maquina escolheu pedra"
                        +"\n------------------------");
            }else if(resposta2 == papel){
                System.out.println(" maquina escolheu papel"
                        +"\n------------------------");
            }else if (resposta2 == tesoura){
                System.out.println(" maquina escolheu tesoura"
                        +"\n------------------------");
            }

            if ( resposta == pedra && resposta2 == tesoura) {
                System.out.println(" pedra ganha de tesoura" +
                        "\n Vitoria jogador 2");
            }else if (resposta == tesoura && resposta2 == papel) {
                System.out.println(" tesoura ganha de papel"
                        + "\n Vitoria jogador 1");
            }else if (resposta == papel && resposta2 == tesoura) {
                System.out.println(" tesoura ganha de papel"
                        + "\n Vitoria jogador 2");
            }else if (resposta == papel && resposta2 == pedra) {
                System.out.println(" papel ganha de pedra"
                        + "\n Vitoria jogador 1");
            }else if(resposta == pedra && resposta2 == papel) {
                System.out.println(" papel ganha de pedra"
                        +"\n Vitoria jogador 2");
            }else if (resposta == resposta2) {
                System.out.println(" Empate dos jogadores");

            }

            scanner.close();
        }
    }



