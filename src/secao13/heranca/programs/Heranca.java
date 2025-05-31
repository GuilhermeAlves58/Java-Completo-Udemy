package secao13.heranca.programs;

import secao13.heranca.entities.Account;
import secao13.heranca.entities.BusinessAccount;
import secao13.heranca.entities.SavingsAccount;

public class Heranca {
    public static void main(String[] args) {
        Account acc = new Account(72, "Seu Madruga",100.0);
        BusinessAccount bacc = new BusinessAccount(2222, "Maira",10000.0,1000.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(14,"Dona Florinda",908.0,400.0);
        Account acc3 = new SavingsAccount(22,"Lindomar O Destruidor",500.0,0.50);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(121);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(10);
            System.out.println("Loan");
        }
        if (acc3 instanceof SavingsAccount ){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updatedBalance();
            System.out.println("Updated Balance");
        }
    }
}
