package secao13.ExerFixacao00;

import secao13.ExerFixacao00.entities.ImportedProduct;
import secao13.ExerFixacao00.entities.Product13;
import secao13.ExerFixacao00.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        List<Product13> product13List = new ArrayList<>();

        System.out.println("Enter the number of products:");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Product"+ (i+1)  +"data: ");
            System.out.print("Common, used or imported (C/U/I)? " );
            char productType = sc.next().toUpperCase().charAt(0);
            if (productType == 'C'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                Product13 product13 = new Product13(name,price);

                product13List.add(product13);
            }
            else if (productType == 'I'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs Fee: ");
                double customsFee = sc.nextDouble();
                Product13 product13 = new ImportedProduct(name,price,customsFee);

                product13List.add(product13);
            }
            else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                Date manufactureDate = format.parse(sc.nextLine());

                Product13 product13 = new UsedProduct(name, price, manufactureDate);

                product13List.add(product13);
            }

        }
        System.out.println();
        System.out.println("Price tag:");
        for (Product13 produc : product13List) {
            System.out.println(produc.priceTag());
        }
    }
}
