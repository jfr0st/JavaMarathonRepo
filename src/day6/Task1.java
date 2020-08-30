package day6;

public class Task1 {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setIssue(1999);
        audi.whatIsThis();
        System.out.println("Разница в годах: " + audi.howOld(2020));
        System.out.println("Разница в годах: " + audi.howOld(1980));

        System.out.println();

        Motorbike suzuki = new Motorbike(2017,"синий", "GSX-R1000RA");
        suzuki.whatIsThis();
        System.out.println("Разница в годах: " + suzuki.howOld(2014));
        System.out.println("Разница в годах: " + suzuki.howOld(2034));


    }
}
