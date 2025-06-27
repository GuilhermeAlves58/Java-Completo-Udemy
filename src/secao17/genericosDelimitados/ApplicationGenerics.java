package secao17.genericosDelimitados;

import secao17.genericosDelimitados.entities.ProductGeneric;
import secao17.genericosDelimitados.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationGenerics {
    public static void main(String[] args) {
        List<ProductGeneric> list = new ArrayList<>();

        String path = "C:\\Games\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new ProductGeneric(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: "+ e.getMessage());;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }

        ProductGeneric x = CalculationService.max(list);
        System.out.println("Max: " + x);
    }
}
