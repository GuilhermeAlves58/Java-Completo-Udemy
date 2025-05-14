package secao07;

import java.util.Scanner;
public class ProblemaExemploFuncao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max(a,b,c);
        showResult(higher);
        sc.close();
    }
    public static int max(int x, int y, int z){
        if ( x > z && x > y){
            return x;
        }
        else if (z > y) {
            return z;
        }
        else {
            return y;
        }
    }

    public static void showResult(int value){
        System.out.println("higher = " + value);
    }
}
