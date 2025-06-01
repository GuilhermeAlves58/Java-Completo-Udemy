package secao13.ClassesAndMetodosAbstrados.entities;


public abstract class Shape {

    private Enums color;

    public Shape() {
    }

    public Shape(Enums color) {
        this.color = color;
    }

    public Enums getColor() {
        return color;
    }

    public void setColor(Enums color) {
        this.color = color;
    }

    public abstract double area();
}