package secao05;

public class Exercicio08 {

    public static String calcularImpostoDeRenda(double salario) {
        double imposto;

        if (salario <= 2000.0) {
            return "Isento";
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        return String.format("R$ %.2f", imposto);
    }

    public static void main(String[] args) {
        System.out.println(calcularImpostoDeRenda(3002.00));
        System.out.println(calcularImpostoDeRenda(1701.12));
        System.out.println(calcularImpostoDeRenda(4520.00));
    }
}
