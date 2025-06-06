package secao15.exemplos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] file = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file1 : file){
            System.out.println(file1);
        }

        boolean sucesses = new File(strPath + "\\subdir").mkdir();
        System.out.println(sucesses);

        sc.close();
    }
}
