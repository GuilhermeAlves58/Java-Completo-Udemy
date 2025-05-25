package secao10;

import java.util.Scanner;

class Aluguel {
    private String nome;
    private String email;

    public Aluguel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ", " + email;
    }
}

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluguel[] quartos = new Aluguel[10]; // índices de 0 a 9

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        for (int i = 1; i <= n; i++) {
            System.out.println("\nRent #" + i + ":");

            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int quarto = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            // Armazena o aluguel no quarto correspondente
            quartos[quarto] = new Aluguel(nome, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}

