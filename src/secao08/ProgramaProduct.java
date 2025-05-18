package secao08;

import secao08.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");

        Product product = new Product();
        System.out.println("Name: ");
        product.name = sc.next();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product.toString());

        System.out.print("Add quantity products:");
        product.addProducts(sc.nextInt());

        System.out.println(product.toString());

        System.out.print("Remove quantity products:");
        product.removeProducts(sc.nextInt());

        System.out.println(product.toString());

        sc.close();
    }
}
