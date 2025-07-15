package secao18.ExerFixacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class MainFixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full path name: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<ProdFixacao> listProd = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                listProd.add(new ProdFixacao(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();

            Stream<String> aboveSalary = listProd.stream().filter(x -> x.getSalary() > salary)
                    .map(x -> x.getEmail())
                    .sorted();
            aboveSalary.forEach(System.out::println);

            double sum = listProd.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
}

        catch (FileNotFoundException e) {
            System.out.println("File not found: "+ e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());;
        }
    }
}
