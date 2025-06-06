package secao15.ExerFixacao;

import java.io.*;
import java.util.*;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String sourceFilePath = sc.nextLine();

        File sourceFile = new File(sourceFilePath);
        String sourceFolderStr = sourceFile.getParent();

        // Cria a subpasta "out"
        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                Product15 product = new Product15(name, price, quantity);

                bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                bw.newLine();

                line = br.readLine();
            }

            System.out.println("summary.csv created successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

