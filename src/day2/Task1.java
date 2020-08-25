package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floorNumber = sc.nextInt();

        if(floorNumber <= 0) System.out.println("Ошибка! В доме должен быть хотя бы 1 этаж.");
        else if(floorNumber >=1 && floorNumber <= 4) System.out.println("Малоэтажный дом");
        else if(floorNumber >=5 && floorNumber <= 8) System.out.println("Среднеэтажный дом");
        else System.out.println("Многоэтажный дом");
    }
}
