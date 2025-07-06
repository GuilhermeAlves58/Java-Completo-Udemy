package secao17.set.solvedExer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainSetSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<LogEntry> set = new TreeSet<>();

        System.out.print("Enter the file path: ");
        String path = sc.next();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String name = fields[0];
                Date date = Date.from(Instant.parse(fields[1]));
                LogEntry userSet = new LogEntry(name,date);
                set.add(userSet);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error " + e.getMessage());;
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());;
        }
        System.out.println("Total users: " + set.size());
        for (LogEntry user : set){
            System.out.println("User " + user.getName() +" "+ user.getDate());
        }
    }
}
