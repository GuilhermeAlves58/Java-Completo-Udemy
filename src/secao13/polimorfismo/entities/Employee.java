package secao13.polimorfismo.entities;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    protected Double paymentValue;

    public Employee(String name,Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment(Integer hours, Double valuePerHour){
        return valuePerHour * hours;
    }

    @Override
    public String toString() {
        return "name='" + name +" - " + '\''+
               payment(hours,valuePerHour);
    }
}
