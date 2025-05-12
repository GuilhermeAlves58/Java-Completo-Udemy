package secao06;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numGasolina = 0;
        int numAlcool = 0;
        int numDiesel = 0;
        int combustivel = 0;

        while(true){
            combustivel = sc.nextInt();
            if (combustivel == 1){
                numAlcool++;
            }
            else if (combustivel == 2) {
                numGasolina++;
            }
            else if (combustivel == 3) {
                numDiesel++;
            }
            else if (combustivel == 4){
                System.out.println("Muito Obrigado: ");
                break;
            }
            else {
                combustivel = sc.nextInt();
            }
        }
        System.out.println("Alcool: " + numAlcool);
        System.out.println("Gasolina: "+ numGasolina);
        System.out.println("Diesel: " + numDiesel);
    }
}
