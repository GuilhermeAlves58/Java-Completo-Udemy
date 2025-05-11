package secao05;

import java.util.Scanner;

public class Exercicio05 {
    Scanner scanner = new Scanner(System.in);
    public static double calcularPreco(int codigo, int quantidade){
        if(codigo == 1){
            return 4.0 * quantidade;
        }
        else if(codigo == 2){
            return 4.5 * quantidade;
        }
        else if ( codigo == 3){
            return 5.0 * quantidade;
        }
        else if( codigo == 4){
            return 2.0 * quantidade;
        }
        else {
            return 1.5 * quantidade;
        }
    }
    public static void main(String[] args) {
        System.out.println("Entrada ");
        System.out.println("Total: " + calcularPreco(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
    }
}
