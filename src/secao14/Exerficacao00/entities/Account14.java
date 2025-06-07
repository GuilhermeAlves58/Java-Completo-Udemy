package secao14.Exerficacao00.entities;

import secao14.Exerficacao00.exception.InvalidOperationException;

public class Account14 {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account14(Integer number,String holder,Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount ) throws InvalidOperationException{
        if (amount <= 0){
            throw  new InvalidOperationException("Can not deposit zero!");
        }
        this.balance = amount;
    }
    public void withdraw(Double amount) throws InvalidOperationException {
        if (amount < 0){
            throw new InvalidOperationException("Must be above zero!");
        }
        if (amount > withdrawLimit){
            throw new InvalidOperationException("Must be lower than withdraw limit!");
        }
        if (amount > balance){
            throw new InvalidOperationException("Can not withdraw above balance!");
        }
        this.balance -= amount;
    }
}
