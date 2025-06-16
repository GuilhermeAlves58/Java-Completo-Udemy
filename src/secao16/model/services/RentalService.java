package secao16.model.services;     

import secao16.model.entities.CarRental;
import secao16.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerhour;

    private TaxServices taxService;

    public RentalService(Double pricePerDay,Double pricePerhour,TaxServices taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerhour = pricePerhour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
        double hours = minutes/60.0;

        double basicPayment;
        if ( hours <= 12.00){
            basicPayment = pricePerhour *Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
