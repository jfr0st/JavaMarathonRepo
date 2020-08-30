package day5;

public class Task1 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setIssue(2020);
        bmw.setColor("синийы");
        bmw.setModel("x7");

        System.out.println("Название новой модели БМВ: " + bmw.getModel());
        System.out.println("Год выпуска новой модели БМВ: " + bmw.getIssue());
        System.out.println("Цвет модели: " + bmw.getColor());
    }
}
