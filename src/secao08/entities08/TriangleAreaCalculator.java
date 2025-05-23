package secao08.entities08;

public class TriangleAreaCalculator {
    public double a;
    public double b;
    public double c;

    public double area(){
        double p =  (a + b + c) / 2.0;
        return Math.sqrt(p*(p -a)*(p -b)*(p -c));

    }
}
