import java.util.Scanner;

public class Aula_12_ {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome :");
        nome = scanner.next();

        System.out.println(" digite sobrenome :");
        sobrenome = scanner.next();

        dizOi(nome,sobrenome);
        notificar(nome);


    }

    public static void dizOi(String nome, String sobrenome) {
        System.out.println("OI, " + nome + " " + sobrenome );

    }

    public static void notificar(String nome){
        System.out.println( nome + " infelizmente, consta atraso de pagamentos.");
    }

}

