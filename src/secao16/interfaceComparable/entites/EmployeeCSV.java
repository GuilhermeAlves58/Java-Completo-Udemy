package secao16.interfaceComparable.entites;

public class EmployeeCSV implements Comparable<EmployeeCSV> {
    private String name;
    private Double salary;

    public EmployeeCSV(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeCSV other) {
        return name.compareTo(other.getName());
    }
}

