package day7;

import day6.plane;

public class Plane {
    private String manufacturer;
    private int issue;
    private double length;
    private double weight;
    private double  fuelCup = 0;

    public Plane(String manufacturer, int issue, double length, double weight) {
        this.manufacturer = manufacturer;
        this.issue = issue;
        this.length = length;
        this.weight = weight;
    }

    void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + issue +
                ", длина: " + length + " метра , вес: " + weight +
                " кг, обьем топлива в баке: " + fuelCup);
    }
    void fillUp(double fuel){
        this.fuelCup = fuel;
        //System.out.println("Самолет заправлен на " + fuel + " литров топлива." );
    }

    //Метод сравнения длины самолетов
    public static void longerPlane(Plane a, Plane b){
        if (a.length > b.length) System.out.println("Самолет " + a.manufacturer + " дилннее.");
        if (b.length > a.length) System.out.println("Самолет " + b.manufacturer + " дилннее.");
        if (b.length == a.length) System.out.println("Длина самолетов ровна");
    }

    public static void main(String[] args) {
        Plane boeing = new Plane("Boeing", 2017,54.9,186880);
        Plane boeing2 = new Plane("Boeing2", 2017,50,186880);
        longerPlane(boeing, boeing2);
    }
}
