package secao17.genericosDelimitados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationGenerics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        String path = "C:\\Games\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: "+ e.getMessage());;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }

        Integer x = CalculationService.max(list);
        System.out.println("Max: " + x);
    }
}
