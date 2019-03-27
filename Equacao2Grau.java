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
        return Math.pow(this.valorB, 2) - 4 * this.valorA * this.valorC;
    }

    public boolean verificar(Double delta) {
        if (delta < 0) {
            return false;
        } else {
            return true;
        }
    }

    public Double calcularX1(Double delta) {
        return (-this.valorB + Math.sqrt(delta)) / (2 * this.valorA);
    }

    public Double calcularX2(Double delta) {
        return (-this.valorB - Math.sqrt(delta)) / (2 * this.valorA);
    }
    public Double calcularXv() {

    }

    public Double calcularYv() {

    }
    
    public void calcular(){
        Double delta = this.calcularDelta();
        if(this.verificar(delta)){
            //verdadeiro
            System.out.println("Calcular duas raízes");
            System.out.println(this.calcularX1());
            System.out.println(this.calcularX2());
        }else{
            //falso
            System.out.println("A equação não possui raiz real");
        }
    }
}
