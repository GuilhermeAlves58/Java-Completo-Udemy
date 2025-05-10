package secao04;

public class Exercicio02 {
    public static double area(double pi, double raio){
        return pi * Math.pow(raio,2.0);
    }
    public static void main(String[] args){
        System.out.println(area(3.14159, 2));
        System.out.println(area(3.14159, 100.64));
        System.out.println(area(3.14159, 150.00));
    }}
