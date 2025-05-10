package secao04;

public class Exercicio06 {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.2;
        System.out.printf("TRIANGULO: %.3f%n", (a * c)/2 );
        System.out.printf("CIRCULO: %.3f%n", 3.14159 * Math.pow(c,2));
        System.out.printf("TRAPEZIO: %.3f%n", ((a + b) * c) /2 );
        System.out.printf("QUADRADO: %.3f%n", Math.pow(b,2));
        System.out.printf("RETANGULO: %.3f%n", a * b);
    }
}
