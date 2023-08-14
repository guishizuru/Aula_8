import javax.swing.*;
import java.util.Scanner;

public class Aula11_2 {
    public static void main(String[] args) {
        String nomeUsuario;
        String senha;
        boolean estaLogado = false;   //true ou false
        int contador = 0;
        Scanner scanner = new Scanner(System.in);


        do {

           System.out.println("digite seu nome de usuário: ");
            nomeUsuario = scanner.next();



            String teste = JOptionPane.showInputDialog("digite um valor:");






       //     JOptionPane.showMessageDialog(null, " voce digitou :" + inteiroTrasnformado  );

            System.out.println(" digite sua senha: ");
            senha = scanner.next();

            if (nomeUsuario.equals("adm") && senha.equals("123")) {
                estaLogado = true;

            } else {

                System.out.println(" USUÁRIO OU SENHA INCORRETOS "
                        + "\n---------------------------------");
            }

            contador++;
            JOptionPane.showMessageDialog(null, " Contador vale :" + contador);
        } while (!estaLogado && contador < 3);
        if (estaLogado) {
//            System.out.println(" login realizado com sucesso "
//
//                    + "\n-------------------------");

            JOptionPane.showMessageDialog(null, " login realizado com sucesso ");


        } else
            System.out.println(" CONTA BLOQUEADA "
                    + "\n-------------------------");

    }
}
