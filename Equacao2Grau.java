public class Equacao2Grau {
    private Double valorA;
    private Double valorB;
    private Double valorC;

    public Equacao2Grau(Double valorA, Double valorB, Double valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    public Double calcularDelta() {
        Double delta = ((valorB * valorB) - (4 * valorA * valorC));
        return delta;
    }

    public Double verificar(Double delta) {
        if (delta < 0) {
            System.out.println("A equação não possui raiz real");
            System.exit(0);
        } else {
            System.out.println("Calcular duas raízes");
           calcularRaiz();
        }
    }

    public static Double calcularRaiz(Double delta, Double valorA, Double valorB) {
        Double x1 = ((-(valorB) + Math.sqrt(delta)) / 2 * valorA);
        Double x2 = ((-(valorB) - Math.sqrt(delta)) / 2 * valorA);

        Double [] resultado = new Double[10];

        resultado[0] = x1;
        resultado[1] = x2;

        return resultado;
    }


}
