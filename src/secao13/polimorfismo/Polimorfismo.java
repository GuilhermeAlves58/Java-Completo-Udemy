package secao13.polimorfismo;

import secao13.polimorfismo.entities.Employee;
import secao13.polimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Polimorfismo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + "#" + i + " data:");
            System.out.print("Outsourced (Y/N): ");
            char outsourced = sc.next().toUpperCase().charAt(0);

            if (outsourced == 'N'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per Hour: ");
                double valuePerHour = sc.nextDouble();

                Employee employee = new Employee(name,hours,valuePerHour);
                employeeList.add(employee);
            }
            else{
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per Hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("AddtionalCharge: ");
                double addtionalCharge = sc.nextDouble();

                Employee employee = new OutsourcedEmployee(name,hours,valuePerHour,addtionalCharge);
                employeeList.add(employee);
            }
        }
        System.out.println("Payments: ");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
}
