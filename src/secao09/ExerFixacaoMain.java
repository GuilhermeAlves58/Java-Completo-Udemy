package secao09;

import secao09.entities09.ExerFixacao;

import java.util.Scanner;

public class ExerFixacaoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExerFixacao conta;

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha

        System.out.print("Enter account holder: ");
        String accHolder = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'y' || resposta == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            conta = new ExerFixacao(accNumber, accHolder, initialDeposit);
        } else {
            conta = new ExerFixacao(accNumber, accHolder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta.info());

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        conta.depositValue(deposit);
        System.out.println("Updated account data:");
        System.out.println(conta.info());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        conta.whithdrawValue(withdraw);
        System.out.println("Updated account data:");
        System.out.println(conta.info());

        sc.close();
    }
}

