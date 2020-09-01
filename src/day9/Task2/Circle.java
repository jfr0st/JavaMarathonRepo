package day9.Task2;

import day9.Task2.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle( double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double area(){
        double s = 3.14 * (radius * radius);
        return s;
    }
    public double perimeter(){
        double perimetr = 2 * 3.14 * radius;
        return perimetr;
    }
}
