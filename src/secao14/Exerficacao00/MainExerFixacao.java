package secao14.Exerficacao00;

import secao14.Exerficacao00.entities.Account14;
import secao14.Exerficacao00.exception.InvalidOperationException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExerFixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String accountHolder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account14 account14 = new Account14(accountNumber,accountHolder,withdrawLimit);
            account14.deposit(initialBalance);

            System.out.println("Enter the amount for withdraw: ");
            double withdraw = sc.nextDouble();
            account14.withdraw(withdraw);

            System.out.println("New balance: " + account14.getBalance()   );
        }
        catch (InvalidOperationException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

        finally {
            sc.close();
        }
    }
}
