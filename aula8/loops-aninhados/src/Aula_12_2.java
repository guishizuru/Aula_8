public class Aula_12_2 {
    public static double calculaHipotenusa( double cateto1, double cateto2){
        double quadradoCateto1 = Math.pow( cateto1, 2.0);
        double quadradoCateto2 = Math.pow( cateto2, 2.0);

        double hipotenusa = Math.pow(quadradoCateto1 + quadradoCateto2, 2.0);
        return hipotenusa;
    }



    public static void main(String[] args){
        double resultado = calculaHipotenusa(4,3);
            System.out.println(resultado);

    }


}
