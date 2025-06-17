package secao16.ExerFixacao.servicesContract;

public class PayPalService implements OnlinePaymentService {
    @Override
    public double paymentFee(double amount) {
        return amount * 0.02 ;
    }
    @Override
    public double interrest(double amount, int moths) {
        return amount * 0.01 * moths;
    }
}
