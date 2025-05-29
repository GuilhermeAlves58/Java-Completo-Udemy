package secao12.application;

import secao12.entitiesExerFixacao.Client;
import secao12.entitiesExerFixacao.Enums.OrderStatus;
import secao12.entitiesExerFixacao.Order;
import secao12.entitiesExerFixacao.OrderItem;
import secao12.entitiesExerFixacao.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class ExerFixacao {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime ordertime = LocalDateTime.now();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth day (DD/MM/YYYY): ");
        Date birthDay = sdf.parse(sc.next());

        Client client = new Client(name,email,birthDay);

        System.out.print("Order Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(),status,client);

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Product quantity: ");
            int productquantity = sc.nextInt();

            Product product = new Product(productName,productPrice);
            OrderItem orderItem = new OrderItem(productquantity,productPrice,product);

            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order.toString());

        sc.close();
    }
}
