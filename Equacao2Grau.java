public class Equacao2Grau {
    private Double valorA;
    private Double valorB;
    private Double valorC;
    private Double delta;
    private Double x1;

    public Equacao2Grau(Double valorA, Double valorB, Double valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    public Double calcularDelta() {
        return Math.pow(this.valorB, 2) - 4 * this.valorA * this.valorC;
    }

    public boolean verificar() {
        if (this.delta < 0) {
            System.out.println("A equação não possui raiz real");
            return false;
        } else {
            System.out.println("Calcular duas raízes");
            return true;
        }
    }

    public Double umaRaiz(){
        if(this.delta == 0){
            Double x1 = -this.valorB /(2 * this.valorA);
        }
        return x1;
    }

    public Double calcularX1() {
        return (-this.valorB + Math.sqrt(delta)) / (2 * this.valorA);
    }

    public Double calcularX2() {
        return (-this.valorB - Math.sqrt(delta)) / (2 * this.valorA);
    }

    public Double calcularXv() {
        return -(this.valorB / 2 * this.valorA);
    }

    public Double calcularYv() {
        return -(this.delta / 4 * this.valorA);
    }
}
