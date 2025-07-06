package secao17.set.ExerFixacao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class MainStudentLog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<StudentLog> studentLogs = new HashSet<>();

        System.out.print("How many students for course A? ");
        int nA = sc.nextInt();
        for (int i = 0; i < nA; i++) {
            studentLogs.add(new StudentLog(sc.nextInt()));
        }

        System.out.print("How many students for course B? ");
        int nB = sc.nextInt();
        for (int i = 0; i < nB; i++) {
            studentLogs.add(new StudentLog(sc.nextInt()));
        }

        System.out.print("How many students for course C? ");
        int nC = sc.nextInt();
        for (int i = 0; i < nC; i++) {
            studentLogs.add(new StudentLog(sc.nextInt()));
        }

        System.out.println("Total students: " + studentLogs.size());
        sc.close();
    }
}