package secao12.entitiesExerFixacao;

public class OrderItem {
    private int quantity;
    private Double price;

    private Product productName;

    public OrderItem(int quantity,double price,Product product) {
        this.quantity = quantity;
        this.price = price;
        this.productName = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double subTotal() {
        return price * quantity;
    }
    @Override
    public String toString() {
        return productName
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
