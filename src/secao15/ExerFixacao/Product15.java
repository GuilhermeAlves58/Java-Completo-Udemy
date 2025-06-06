package secao15.ExerFixacao;

public class Product15 {
    private String name;
    private double price;
    private int quantity;

    public Product15(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double total() {
        return price * quantity;
    }
}
