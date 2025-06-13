package secao16.model;

import secao16.model.entities.CarRental;
import secao16.model.entities.Vehicle;
import secao16.model.services.BrazilTaxService;
import secao16.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ExemplosSemInterfaces {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do Aluguel: ");
        System.out.println("Modelo do carro");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.println("Entrega do veículo (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental carRental = new CarRental(new Vehicle(carModel) ,start,finish);

        System.out.println("Entre com o preço por Hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por Dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay,pricePerHour,new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("Fatura: ");
        System.out.println("Pagamento Básico: " + carRental.getInvoice().getBasicPayment());

    }
}
