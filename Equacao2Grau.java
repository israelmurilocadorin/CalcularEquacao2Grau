public class Equacao2Grau {
    private Double valorA;
    private Double valorB;
    private Double valorC;
    private Double delta;
    private Double x1;
    private Double x2;
    private Double xVertice;
    private Double yVertice;

    public Equacao2Grau(Double valorA, Double valorB, Double valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    public Double calcularDelta() {
        delta = Math.pow(this.valorB, 2) - 4 * this.valorA * this.valorC;
        return delta;
    }

    public void verificar() {
        if (this.delta < 0) {
            System.out.println("A equação não possui raiz real");
        } else {
            valorDelta();
        }
    }

    public void valorDelta(){
        if(this.delta == 0){
            x1 = -this.valorB /(2 * this.valorA);
        } else {
            calcularX1();
            calcularX2();
        }
    }

    public Double calcularX1() {
        x1 = (-this.valorB - Math.sqrt(this.delta)) / (2 * this.valorA);
        return x1;
    }

    public Double calcularX2() {
        x2 = (-this.valorB + Math.sqrt(this.delta)) / (2 * this.valorA);
        return x2;
    }

    public Double calcularXVertice() {
        xVertice = -(this.valorB / 2 * this.valorA);
        return xVertice;
    }

    public Double calcularYVertice() {
        yVertice = -(this.delta / 4 * this.valorA);
        return yVertice;
    }

    public String imagem() {
        if(this.valorA > 0) {
            return ("[-" + this.valorA + ", +∞)");
        } else {
            return ("(-∞, +" + this.valorA + "]");
        }
    }

    @Override
    public String toString(){
        return ("Delta: " + this.delta +
                "\nX1: " + this.x1 +
                "\nX2: " + this.x2 +
                "\nX Vértice: " + this.xVertice +
                "\nY Vértice: " + this.yVertice +
                "\nConjunto imagem: ");
    }

    public void geral() {
        calcularDelta();
        verificar();
        calcularXVertice();
        calcularYVertice();
    }
}