import java.util.Scanner;

public class Aula_12_5 {

  public static boolean verificaMatricula(String nomeUsuario, String cpfUsuario,
                                        String vetorNomes[], String vetorCpfs[], int tamanhoVetores){
      for( int i = 0; i < tamanhoVetores; i ++){
          if(vetorNomes[i].equals(nomeUsuario)   && vetorCpfs[i].equals(cpfUsuario)){
    return true;

          }
      }
      return false;

  }

    public static void main(String[]args){
        final int tamanho_vetores =3;
        String [] nomes = new String[tamanho_vetores];
        String [] cpf = new String[tamanho_vetores];
        Scanner scanner = new Scanner(System.in);
        for( int i=0; i < tamanho_vetores; i ++){
            System.out.println("digite o " + ( i + 1) + " nome :" );

            nomes[i]= scanner.next();

            System.out.println(" digite o " + ( i + 1) + " cpf :");
            cpf[i] = scanner.next();
        }
        String nomeIndividuo;
        String cpfIndividuo;

        System.out.println("digite o nome do usuario que deseja acessar a sala : ");
       nomeIndividuo = scanner.next();

        System.out.println("digite o cpf do usuario que deseja acessar a sala : ");
        cpfIndividuo = scanner.next();

       boolean estaMatriculado = verificaMatricula(nomeIndividuo, cpfIndividuo, nomes, cpf, tamanho_vetores);
        if(estaMatriculado){
            System.out.println("ESTÁ MATRICULADO");
        }else{
            System.out.println("NÃO ESTÁ MATRICULADO");
        }

    }

}
