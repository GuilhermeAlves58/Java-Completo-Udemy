package secao18.comparatorExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramComparator {
    public static void main(String[] args) {
        List<ProductComparator> list = new ArrayList<>();
        list.add(new ProductComparator("Tv", 900.0));
        list.add(new ProductComparator("Notebook", 1200.0));
        list.add(new ProductComparator("Tablet", 450.0));

        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        for (ProductComparator p : list){
            System.out.println(p);
        }
    }
}
