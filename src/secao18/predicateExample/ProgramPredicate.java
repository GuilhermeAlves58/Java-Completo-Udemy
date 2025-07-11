package secao18.predicateExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProgramPredicate {
    public static void main(String[] args) {
        List<PredicateProduct> list = new ArrayList<>();
        list.add(new PredicateProduct("Tv", 900.00));
        list.add(new PredicateProduct("Mouse", 50.00));
        list.add(new PredicateProduct("Tablet", 350.50));
        list.add(new PredicateProduct("HD Case", 80.90));

        list.removeIf(p -> p.getPrice() >= 100);

        for (PredicateProduct p : list){
            System.out.println(p);
        }
    }
}
