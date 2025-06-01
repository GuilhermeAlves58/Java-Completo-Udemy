package secao13.ExerFixacao01;

import secao13.ExerFixacao01.entities.PagadorDeImposto;
import secao13.ExerFixacao01.entities.PessoaFisica;
import secao13.ExerFixacao01.entities.PessoaJuridica;

import java.util.*;

public class Aplicacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<PagadorDeImposto> lista = new ArrayList<>();

        System.out.print("Digite o número de pagadores: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Pagador #" + i + ":");
            System.out.print("Pessoa física ou jurídica (f/j)? ");
            char tipo = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();

            if (tipo == 'f') {
                System.out.print("Gastos com saúde: ");
                double saude = sc.nextDouble();
                lista.add(new PessoaFisica(nome, renda, saude));
            } else {
                System.out.print("Número de funcionários: ");
                int funcionarios = sc.nextInt();
                lista.add(new PessoaJuridica(nome, renda, funcionarios));
            }
        }

        System.out.println("\nIMPOSTOS PAGOS:");
        double total = 0.0;
        for (PagadorDeImposto pagador : lista) {
            double valor = pagador.imposto();
            System.out.printf("%s: $ %.2f%n", pagador.getNome(), valor);
            total += valor;
        }

        System.out.printf("TOTAL DE IMPOSTOS: $ %.2f%n", total);

        sc.close();
    }
}
