package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker mike = new Picker();
        Courier sam = new Courier();

        for(int i = 1; i <= 1500; i ++){
            mike.doWork();
            mike.bonus();
        }

        do{
            sam.doWork();
            sam.bonus();
        }while (warehouse.getBalance() < 1000000);


        System.out.println(warehouse);
        System.out.println("Зарплата сборщика составила: " + mike.getSalary());
        System.out.println("Зарплата курьера составила: " + mike.getSalary());
    }
}
