package secao13.polimorfismo.entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment(Integer hours, Double valuePerHour){
        paymentValue = (valuePerHour * hours) + (additionalCharge * 1.10);
        return paymentValue;
    }

    @Override
    public String toString() {
        return  getName() +" - " + '\''+
                payment(getHours(),getValuePerHour());
    }
}
