package day6;

public class plane {
    private String manufacturer;
    private int issue;
    private double length;
    private double weight;
    private double  fuelCup = 0;

    public plane(String manufacturer, int issue, double length, double weight) {
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
}
