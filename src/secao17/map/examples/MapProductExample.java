package secao17.map.examples;

import java.util.Objects;

public class MapProductExample {
    private String name;
    private Double price;

    public MapProductExample(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        MapProductExample that = (MapProductExample) o;
        return Objects.equals(name, that.name) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(price);
        return result;
    }
}
