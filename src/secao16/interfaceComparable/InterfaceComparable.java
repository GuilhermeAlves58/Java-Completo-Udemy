package secao16.interfaceComparable;

import secao16.interfaceComparable.entites.EmployeeCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceComparable {
    public static void main(String[] args) {

        List<EmployeeCSV> list = new ArrayList<>();
        String path = "C:\\Games";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeeCSV = br.readLine();
            while (employeeCSV != null){
                String[] fields = employeeCSV.split(",");
                list.add(new EmployeeCSV(fields[0],Double.parseDouble(fields[1])));
                employeeCSV = br.readLine();
            }
            Collections.sort(list);
            for (EmployeeCSV emp : list) {
                System.out.println(emp.getName() + "," + emp.getSalary());
            }
        }
        catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
