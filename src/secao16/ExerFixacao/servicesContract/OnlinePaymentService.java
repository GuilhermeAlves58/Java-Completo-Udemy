package secao16.ExerFixacao.servicesContract;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interrest(double amount, int moths);
}
