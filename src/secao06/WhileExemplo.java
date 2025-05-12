package secao06;

import java.util.Scanner;

public class WhileExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int soma = 0;
        while (num != 0){
            num = sc.nextInt();
            soma += num;
        }
        sc.close();
        System.out.println(soma);
    }
}
