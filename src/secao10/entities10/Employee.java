package secao10.entities10;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id,String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public double increaseSalary(double percentage){
        return salary += salary * percentage / 100;
    }
}
