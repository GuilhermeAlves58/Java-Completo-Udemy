package secao10;
import secao10.entities10.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioLista {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {

            System.out.println();
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();

        // Integer pos = position(list, idSalary);

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        // if (pos == null) {
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            //list.get(pos).increaseSalary(percent);
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

// Meu código sem List:
// package secao10;
//
//import secao10.entities10.Employee;
//
//import java.util.Scanner;
//
//public class ExercicioLista {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("How many employees will be registered? ");
//        int numberOfEmployees = scanner.nextInt();
//        Employee[] employees = new Employee[numberOfEmployees];
//
//        for (int i = 0; i < numberOfEmployees; i++) {
//            System.out.print("Id: ");
//            int id = scanner.nextInt();
//            scanner.nextLine();
//            System.out.print("Name: ");
//            String name = scanner.nextLine();
//            System.out.print("Salary: ");
//            double salary = scanner.nextDouble();
//            employees[i] = new Employee(id,name,salary);
//        }
//        System.out.print("Enter the employee that will have the salary increased: ");
//        int id = scanner.nextInt();
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getId() == id){
//                System.out.print("Percentage: ");
//                int percentage = scanner.nextInt();
//                employees[i].increaseSalary(percentage);
//            }
//            else {
//                System.out.println("This Id doesn't exist");
//            }
//        }
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i].getId() + ", " + employees[i].getName() + ", "+ employees[i].getSalary() );
//        }
//    }
//}
// Consegui implementar o que foi pedido na seção 10 aula 100 ,mas não do jeito certo