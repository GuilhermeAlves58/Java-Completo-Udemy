package secao13.heranca.entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
                balance += amount - 10;
        }
    }
    @Override
    public void whithdraw(Double balance){
        super.whithdraw(balance);
        this.balance -= 2;
    }
}
