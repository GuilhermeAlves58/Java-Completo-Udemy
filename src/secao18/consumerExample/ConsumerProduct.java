package secao18.consumerExample;

public class ConsumerProduct {
    private String name;
    private Double price;

    public ConsumerProduct(String name, Double price) {
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

    public static void staticPriceUpdate(ConsumerProduct p) {
        p.setPrice(p.getPrice() * 1.1);
    }
    public void nonstaticPriceUpdate() {
        price = price * 1.1;
    }
    @Override
    public String toString() {
        return "PredicateProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
