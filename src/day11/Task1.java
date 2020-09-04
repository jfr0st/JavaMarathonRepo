package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker mike = new Picker(warehouse);
        Courier sam = new Courier(warehouse);
/*
        for(int i = 1; i <= 1500; i ++){
            mike.doWork();
            mike.bonus();
        }

        do{
            sam.doWork();
            sam.bonus();
        }while (warehouse.getBalance() < 1000000); */

        for (int i = 1; i <= 1500; i++){
            mike.doWork();
            sam.doWork();
        }

        mike.bonus();
        sam.bonus();

        System.out.println(warehouse);
        System.out.println("Зарплата сборщика составила: " + mike.getSalary() + "\nЗарплата курьера составила: " + sam.getSalary());

        //Склад одежды
        System.out.println();

        ClothesWarehouse clothesWarehouse = new ClothesWarehouse();
        Picker simPiker = new Picker(clothesWarehouse);
        Courier simCourier = new Courier(clothesWarehouse);

        for (int i = 0; i <100; i++){
            simPiker.doWork();
            simCourier.doWork();
        }

        System.out.println(clothesWarehouse);
    }
}
