package secao12.application;

import secao12.entities12.Enums.OrderStatus;
import secao12.entities12.Order;

import java.util.Date;

public class Enumeracao {
    public static void main(String[] args) {
        Order order = new Order(1808,new Date(), OrderStatus.Pending_Payment);
        OrderStatus os1 = OrderStatus.Delivered;
        OrderStatus os2 = OrderStatus.valueOf("Delivered");

        System.out.println(order);
        System.out.println(os1);
        System.out.println(os2);
    }
}
