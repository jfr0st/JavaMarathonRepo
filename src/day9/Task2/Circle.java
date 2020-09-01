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
        return 3.14 * (radius * radius);
    }
    public double perimeter(){
        return 2 * 3.14 * radius;
    }
}
