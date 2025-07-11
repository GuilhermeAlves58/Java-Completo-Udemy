package secao18.consumerExample;

import java.util.ArrayList;
import java.util.List;

public class ConsumerMain {
    public static void main(String[] args) {
        List<ConsumerProduct> list = new ArrayList<>();
        list.add(new ConsumerProduct("Tv", 900.00));
        list.add(new ConsumerProduct("Mouse", 50.00));
        list.add(new ConsumerProduct("Tablet", 350.50));
        list.add(new ConsumerProduct("HD Case", 80.90));

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(System.out::println);

    }
}
