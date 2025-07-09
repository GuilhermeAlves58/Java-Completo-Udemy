package secao18.comparatorExample;

import java.util.Comparator;

public class MyComparator implements Comparator<ProductComparator> {
    @Override
    public int compare(ProductComparator o1, ProductComparator o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
