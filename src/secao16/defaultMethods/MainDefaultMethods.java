package secao16.defaultMethods;


import secao16.defaultMethods.services.InterestService;
import secao16.defaultMethods.services.USAInterestService;

import java.util.Scanner;

public class MainDefaultMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int moths = sc.nextInt();

        InterestService usaInterestService = new USAInterestService(1)
        double payment = usaInterestService.payment(amount,moths);

        System.out.println("Payment after " + moths + " months: ");
        System.out.println(String.format("%.2f", payment));
    }
}
