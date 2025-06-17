package secao16.ExerFixacao;

import secao16.ExerFixacao.entitiesContract.Contract;
import secao16.ExerFixacao.entitiesContract.Installment;
import secao16.ExerFixacao.servicesContract.ContractService;
import secao16.ExerFixacao.servicesContract.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ApplicationExer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter the contract data:");

        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(),fmt);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number,date,totalValue);

        System.out.print("Enter number of installments: ");
        int installments = sc.nextInt();

        ContractService contractService = new ContractService(new PayPalService());
        contractService.processContract(contract, installments);

        System.out.println("installments");
        for (Installment install : contract.getInstallments()){
            System.out.println(install);
        }

        sc.close();
    }
}
