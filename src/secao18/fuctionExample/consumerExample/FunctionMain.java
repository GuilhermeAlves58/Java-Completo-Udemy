package secao18.fuctionExample.consumerExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FunctionMain {
    public static void main(String[] args) {
        List<FunctionProduct> list = new ArrayList<>();
        list.add(new FunctionProduct("Tv", 900.00));
        list.add(new FunctionProduct("Mouse", 50.00));
        list.add(new FunctionProduct("Tablet", 350.50));
        list.add(new FunctionProduct("HD Case", 80.90));

        List<String>names =  list.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);

    }
}
