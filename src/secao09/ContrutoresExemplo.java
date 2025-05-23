
package secao09;
import secao09.entities09.Product;

import java. util.Locale;
import java.util.Scanner;

public class ContrutoresExemplo {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc= new Scanner(System.in);


            System.out.println("Enterproductdata: ");
            System.out.print("Name: ");
            String name= sc.nextLine();
            System.out.print("Price: ");
            double price= sc.nextDouble();
            System.out.print("Quantityin stock: ");
            int quantity= sc.nextInt();
            Product product = new Product(name,price,quantity);

            System.out.println();
            System.out.println("Product data: "+ product);
            System.out.println();
            System.out.print("Enter the number of products to be added in stock: ");

            quantity = sc.nextInt();
            product.addProducts(quantity);
            System.out.println();
            System.out.println("Updateddata: "+ product);
            System.out.println();
            System.out.print("Enter the number of products to be removed from stock: ");
            quantity= sc.nextInt();
            product.removeProducts(quantity);
            System.out.println();
            System.out.println("Updateddata: "+ product);
            sc.close();
        }
}

