package secao08.entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convert(double dollarPrice, double amount) {
        double totalWithoutIOF = dollarPrice * amount;
        double totalWithIOF = totalWithoutIOF * (1.0 + IOF);
        return totalWithIOF;
    }
}
