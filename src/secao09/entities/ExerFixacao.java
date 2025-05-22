package secao09.entities;

public class ExerFixacao {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Construtor sem depósito inicial
    public ExerFixacao(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    // Construtor com depósito inicial (sobrecarga)
    public ExerFixacao(int accountNumber, String accountHolder, double initialValue) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        depositValue(initialValue);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public ExerFixacao setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
        return this;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depositValue(double value) {
        this.balance += value;
    }

    public void whithdrawValue(double value) {
        this.balance -= (value + 5.00);
    }

    public String info() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", accountNumber, accountHolder, balance);
    }
}
