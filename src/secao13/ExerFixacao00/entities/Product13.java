package secao13.ExerFixacao00.entities;

public class Product13 {
    private String name;
    private Double price;

    public Product13(String name,Double price) {
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

    public String priceTag(){
     return this.name + " $"+ this.price;
    }
}
