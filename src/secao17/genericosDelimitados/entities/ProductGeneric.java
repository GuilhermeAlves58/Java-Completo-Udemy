package secao17.genericosDelimitados.entities;

public class ProductGeneric implements Comparable<ProductGeneric> {
    private String name;
    private Double price;

    public ProductGeneric( String name,Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(ProductGeneric o) {
        return price.compareTo(o.getPrice());
    }

    @Override
    public String toString() {
        return "ProductGeneric{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
