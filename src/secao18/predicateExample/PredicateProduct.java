package secao18.predicateExample;

public class PredicateProduct {
    private String name;
    private Double price;

    public PredicateProduct(String name, Double price) {
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

    public static boolean staticProductPredicate(PredicateProduct p){
        return p.getPrice() >= 100;
    }
    public boolean nonStaticProductPredicate(PredicateProduct p){
        return price >= 100;
    }

    @Override
    public String toString() {
        return "PredicateProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
