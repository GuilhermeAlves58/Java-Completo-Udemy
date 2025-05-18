package secao08;

import secao08.entities.Student;

import java.util.Scanner;

public class ExerFixacao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Name: ");
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        System.out.println("Final Grade: " + student.finalGrade());

        if (student.isPassed() == false){
            System.out.println("Failed");
            System.out.println("Missing " + student.missingPoints());
       }else {
            System.out.println("Pass");
        }
    }
}
