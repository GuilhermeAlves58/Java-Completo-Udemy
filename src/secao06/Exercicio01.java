package secao06;

import java.util.Scanner;

public class Exercicio01 {
    public static String validadorDeSenha(int senha){
        if (senha == 2002){
            return "Acesso Permitido";
        }
        else {
            return "Senha Invalida";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (validadorDeSenha(num) == "Senha Invalida"){
            System.out.println(validadorDeSenha(sc.nextInt()));
        }
        sc.close();
    }
}
