package secao08;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSemPOOTriangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Triangle x:");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        System.out.println("Triangle y:");
        double side4 = sc.nextDouble();
        double side5 = sc.nextDouble();
        double side6 = sc.nextDouble();

        double p1 = (side1 + side2 + side3)/2.0;
        double p2 = (side4 + side5 + side6)/2.0;
        double area1 = Math.sqrt(p1 *(p1 - side1 ) * (p1 - side2) * (p1 - side3));
        double area2 = Math.sqrt(p2 *(p2 - side4 ) * (p2 - side5) * (p2 - side6));

        System.out.println("Triangle x area: " + area1 );
        System.out.println("Triangle y area: " + area2);

        if (area1 > area2){
            System.out.println("Larger area: x");
        }
        else {
            System.out.println("Larger area: y");
        }

        sc.close();
    }
}
