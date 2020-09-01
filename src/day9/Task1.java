package day9;

public class Task1 {
    public static void main(String[] args) {
        Student mike = new Student("Майк", "Группа информационых технологий");
        Teacher stiv = new Teacher("Стив", "Информационые технологии и процессы");

        mike.printInfo();
        System.out.println();
        stiv.printInfo();
    }
}
