package secao10;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAlturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantas pessoas serão digitadas: ");
        int numPessoas = sc.nextInt();

        String[] nome = new String[numPessoas];
        int[] idade = new int[numPessoas];
        double[] altura = new double[numPessoas];
        double soma = 0;
        double mediaAlturas;
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Dados " + (i+1) + "pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        for (int i = 0; i < numPessoas; i++) {
            soma = soma + altura[i];
        }
        mediaAlturas = soma/numPessoas;
        System.out.println("Altura média:"+ mediaAlturas);
        int menorDe16 = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (idade[i] < 16){
                menorDe16 += 1;
            }
        }
        double porcentagemMenorDe16 = menorDe16 * 100.0 / numPessoas;
        System.out.println(porcentagemMenorDe16);
        for (int i = 0; i < numPessoas; i++) {
            if (idade[i] < 16){
                System.out.println("Pessoas menor 16: "+nome[i]);
            }
        }
        sc.close();
    }
}
