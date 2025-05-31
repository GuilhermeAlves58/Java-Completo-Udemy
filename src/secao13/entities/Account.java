package secao13.entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account(Integer number,String holder,Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    public void whithdraw(Double balance){
        this.balance -= balance;
    }
    public void deposit(Double balance){
        this.balance += balance;
    }
}
