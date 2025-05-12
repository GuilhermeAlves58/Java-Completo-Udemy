package secao06;

import java.util.Scanner;

public class DoWhileLoopExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont;
        do {
            System.out.println("Digite a temperatura(C): ");
            int celcius = sc.nextInt();
            int fahrenheit = (9*celcius) / 5 + 32;
            System.out.println(fahrenheit);
            System.out.println("Continue: (s/n)");
            cont = sc.next().charAt(0);
        } while (cont != 'n');
        sc.close();
    }

}
