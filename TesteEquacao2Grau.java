public class TesteEquacao2Grau {

    public static void main(String[] args) {

        Equacao2Grau equacao = new Equacao2Grau(Double.valueOf(args[0]), Double.valueOf(args[1]), Double.valueOf(args[2]));

        System.out.println(equacao.calcularDelta());
        equacao.verificar();
    }

}