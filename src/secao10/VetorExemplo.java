package secao10;

import java.util.Scanner;

public class VetorExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        double ave = sum/n;
        System.out.printf("Average: %.2f",ave);

    }
}
