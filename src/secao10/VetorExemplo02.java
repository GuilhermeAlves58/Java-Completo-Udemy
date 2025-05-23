package secao10;

import secao10.entities10.ProductVetor;

import java.util.Locale;
import java.util.Scanner;

public class VetorExemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double sum = 0;
        ProductVetor[] vect = new ProductVetor[n];

        for (int i = 0; i < n; i++) {
            String  name = sc.next();
            double price = sc.nextDouble();
            vect[i] = new ProductVetor(name,price);
            sum += vect[i].getPrice();
        }
        double avg = sum/n;
        System.out.printf("Average price: %.2f%n",avg);
        sc.close();
    }

}
