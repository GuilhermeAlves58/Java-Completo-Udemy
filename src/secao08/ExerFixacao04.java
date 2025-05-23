package secao08;

import secao08.entities08.CurrencyConverter;

import java.util.Scanner;

public class ExerFixacao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.convert(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();
    }
}
