package secao18.funcaoLambdaComoParametro;

import java.util.ArrayList;
import java.util.List;

public class Tmain {
    public static void main(String[] args) {
        List<TProducts> list = new ArrayList<>();
        list.add(new TProducts("Tv", 900.00));
        list.add(new TProducts("Mouse", 50.00));
        list.add(new TProducts("Tablet", 350.50));
        list.add(new TProducts("HD Case", 80.90));

        TService tService = new TService();
        double sum = tService.filteredSum(list, p-> p.getName().charAt(0) == 'T');
        System.out.println("Sum: " + sum);
    }
}
