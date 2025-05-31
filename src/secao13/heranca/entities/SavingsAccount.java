package secao13.heranca.entities;

public class SavingsAccount extends Account {

    private Double interrestRate;

    public SavingsAccount(Integer number, String holder, Double balance, Double interrestRate) {
        super(number, holder, balance);
        this.interrestRate = interrestRate;
    }

    public Double getInterrestRate() {
        return interrestRate;
    }

    public void setInterrestRate(Double interrestRate) {
        this.interrestRate = interrestRate;
    }

    public void updatedBalance(){
        balance += balance * interrestRate;
    }
    @Override
    public void whithdraw(Double balance){
        this.balance -= balance;
    }
}
