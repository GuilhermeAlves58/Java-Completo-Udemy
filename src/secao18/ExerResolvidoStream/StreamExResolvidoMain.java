package secao18.ExerResolvidoStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class StreamExResolvidoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full path name: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<ProductStreamEx> listProd = new ArrayList<>();
            double sum = 0;
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                listProd.add(new ProductStreamEx(fields[0],Double.parseDouble(fields[1])));
                sum += Double.parseDouble(fields[1]);
                line = br.readLine();
            }
            int numberOfProducts = listProd.size();
            double average = sum / numberOfProducts;
            System.out.println("Average price: " + String.format("%.2f",average));

            Comparator<ProductStreamEx> comp = (s1,s2) -> s1.getName().toUpperCase().compareTo(s2.getName().toUpperCase());
            Stream<ProductStreamEx> filter = listProd.stream().filter(x-> x.getPrice() < average)
                    .sorted(comp.reversed());
            filter.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+ e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception: "+ e.getMessage());
        }
        sc.close();
    }
}
