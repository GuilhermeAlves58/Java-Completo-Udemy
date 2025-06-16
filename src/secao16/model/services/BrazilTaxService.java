package secao16.model.services;

public class BrazilTaxService implements TaxServices {
    public double tax(double amount){
        if ( amount <= 100){
            return amount * 0.2;
        }
        else {
            return amount * 0.15;
        }
    }
}
