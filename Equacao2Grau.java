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

    public boolean verificar(Double delta) {
        if (delta < 0) {
            System.out.println("A equação não possui raiz real");
            return false;
        } else {
            System.out.println("Calcular duas raízes");
            return true;
        }
    }

    public Double calcularX1(Double delta) {
        Double x1 = ((-(valorB) + Math.sqrt(delta)) / 2 * valorA);
        return x1;
    }

    public Double calcularX2(Double delta) {
        Double x2 = ((-(valorB) - Math.sqrt(delta)) / 2 * valorA);
        return x2;
    }

    @Override
    public String toString() {

    }
}
