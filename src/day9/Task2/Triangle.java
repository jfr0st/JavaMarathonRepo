package day9.Task2;

public class Triangle extends Figure {
    private double lenghtA;
    private double lenghtB;
    private double lenghtC;

    public Triangle(double lenghtA, double lenghtB, double lenghtC, String color) {
        super(color);
        this.lenghtA = lenghtA;
        this.lenghtB = lenghtB;
        this.lenghtC = lenghtC;
    }

    public double getLenghtA() {
        return lenghtA;
    }

    public double getLenghtB() {
        return lenghtB;
    }

    public double getLenghtC() {
        return lenghtC;
    }

    public void setLenghtA(double lenghtA) {
        this.lenghtA = lenghtA;
    }

    public void setLenghtB(double lenghtB) {
        this.lenghtB = lenghtB;
    }

    public void setLenghtC(double lenghtC) {
        this.lenghtC = lenghtC;
    }

    public double area(){
        double p = (lenghtA + lenghtB + lenghtC) / 2;
        double s =Math.sqrt((p*(p-lenghtA)*(p-lenghtB)*(p-lenghtC)));
        return s;
    }
    public double perimeter(){
        double p = lenghtA + lenghtB + lenghtC;
        return p;
    }
}
