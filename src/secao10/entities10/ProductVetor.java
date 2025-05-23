package secao10.entities10;

public class ProductVetor {
    private String name;
    private double price;

    public ProductVetor(String name,double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ProductVetor setName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public ProductVetor setPrice(double price) {
        this.price = price;
        return this;
    }
}
