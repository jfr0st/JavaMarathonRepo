package day6;

public class Motorbike {

    private int issue;
    private String color;
    private String model;

    public Motorbike(int issue, String color, String model) {
        this.issue = issue;
        this.color = color;
        this.model = model;
    }

    public void whatIsThis(){
        System.out.println("Это мотоцикл");
    }

    public int howOld(int year){
        int diff = this.issue - year;
        return Math.abs(diff);
    }

  /*  @Override
    public String toString(){
        String str = issue + " " + color + " " + model;
        return str;
    } */


}
