package secao16.model.services;

import secao16.model.entities.CarRental;
import secao16.model.entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerhour;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerDay,Double pricePerhour,BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerhour = pricePerhour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        carRental.setInvoice(new Invoice(50,10));
    }
}
