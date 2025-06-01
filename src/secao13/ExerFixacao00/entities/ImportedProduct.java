package secao13.ExerFixacao00.entities;

public class ImportedProduct extends  Product13 {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double costomsFee) {
        super(name, price);
        this.customsFee = costomsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }
    @Override
    public String priceTag(){
        return getName() + " $"+ totalPrice()+ "(Customs fee: $" + customsFee + ")";
    }
}
