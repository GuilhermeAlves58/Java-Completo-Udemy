package secao17.map.examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample02 {
    public static void main(String[] args) {
        Map<MapProductExample, Double> stock = new HashMap<>();
        MapProductExample p1 = new MapProductExample("Tv", 900.0);
        MapProductExample p2 = new MapProductExample("Notebook", 1200.0);
        MapProductExample p3 = new MapProductExample("Tablet", 400.0);
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        MapProductExample ps = new MapProductExample("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
