package secao08;

import secao08.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ExerFixacao01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.printf("%.2f%n",rectangle.area());
        System.out.printf("%.2f%n",rectangle.perimeter());
        System.out.printf("%.2f%n",rectangle.diagonal());
    }
}
