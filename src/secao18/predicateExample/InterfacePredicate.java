package secao18.predicateExample;

import java.util.function.Predicate;

public class InterfacePredicate implements Predicate<PredicateProduct> {
    @Override
    public boolean test(PredicateProduct p) {
        return p.getPrice() >= 100;
    }
}
