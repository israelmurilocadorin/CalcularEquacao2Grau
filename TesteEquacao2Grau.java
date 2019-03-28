import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TesteEquacao2Grau {

    public static void main(String[] args) {

        Double valorA = Double.valueOf(args[0]);
        Double valorB = Double.valueOf(args[1]);
        Double valorC = Double.valueOf(args[2]);
        DecimalFormat df = new DecimalFormat("#0.0");
        //String decision;
        //decision = JOptionPane.showInputDialog("Would you like to do another operation? Choice Y(yes) or N(no): ");

        Equacao2Grau equacao = new Equacao2Grau(valorA, valorB, valorC);

        System.out.println(equacao.calcularDelta());
        System.out.println(equacao.calcularX1());
        System.out.println(equacao.calcularX2());
        System.out.println();
        System.out.println(equacao.umaRaiz());



    }
}
