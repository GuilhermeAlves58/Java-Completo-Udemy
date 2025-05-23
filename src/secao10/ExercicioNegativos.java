package secao10;

import java.util.Scanner;

public class ExercicioNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lerNumeros = sc.nextInt(10);
        int[] vetorNegativos = new int[lerNumeros];

        for (int i = 0; i < vetorNegativos.length; i++) {
            int num = sc.nextInt();
            if (num < 0) {
                vetorNegativos[i] = num;
            }
        }
        for (int j = 0; j < vetorNegativos.length; j++) {
            if (vetorNegativos[j] < 0){
                System.out.println(vetorNegativos[j]);
            }
        }
        sc.close();
    }
}