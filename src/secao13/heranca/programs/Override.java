package secao13.heranca.programs;

import secao13.heranca.entities.Account;
import secao13.heranca.entities.BusinessAccount;
import secao13.heranca.entities.SavingsAccount;

public class Override {

    public static void main(String[] args) {
     Account account = new Account(1012,"alex",1000.0);
     account.whithdraw(200.00);
        System.out.println(account.getBalance());
        Account account2 = new SavingsAccount(1809,"Santos",10.0,0.01);
        account2.whithdraw(5.0);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(200, "Zé Rato",1100.0,500.0);
        account3.whithdraw(200.0);
        System.out.println(account3.getBalance());
        SavingsAccount sac = new SavingsAccount(100,"adfas",100.0,0.10);
    }
}
