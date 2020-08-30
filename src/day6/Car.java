package day6;

public class Car {
    private int issue;
    private String color;
    private String model;

    public void whatIsThis(){
        System.out.println("Это машина");
    }

    public int howOld(int year){
        int diff = this.issue - year;
        return Math.abs(diff);
    }

    public void setIssue(int CarIssue) {
        issue = CarIssue;
    }

    public int getIssue() {
        return issue;
    }

    public void setColor(String CarColor) {
        color = CarColor;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String CarModel) {
        model = CarModel;
    }

    public String getModel() {
        return model;
    }
}
