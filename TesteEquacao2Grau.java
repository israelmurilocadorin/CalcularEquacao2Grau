public class TesteEquacao2Grau {

    public static void main(String[] args) {
        Double valorA = Double.valueOf(args[0]);
        Double valorB = Double.valueOf(args[1]);
        Double valorC = Double.valueOf(args[2]);

        Equacao2Grau equacao = new Equacao2Grau(valorA, valorB, valorC);

        System.out.println(equacao.calcularDelta());
        equacao.calcularX1();
    }

}