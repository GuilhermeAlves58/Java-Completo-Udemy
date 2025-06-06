package secao15.exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndBuffedReader {
    public static void main(String[] args) {
        String path = "c:\\temp\\in.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " +e.getMessage() );
        }
        finally {
            try {
            if (bufferedReader != null){
                bufferedReader.close();
            }
            if (fileReader != null){
                fileReader.close();
            }

        }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
