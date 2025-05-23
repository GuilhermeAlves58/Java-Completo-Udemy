package secao08;

import secao08.entities08.Employee;

import java.util.Scanner;

public class ExerFixacao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee.name + ", $ " + employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.print("Updated data: " + employee.name + ", $ " + employee.netSalary());
        sc.close();
    }
}
