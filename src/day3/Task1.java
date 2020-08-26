package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String city;
        while(true){
            Scanner sc = new Scanner(System.in);
            city = sc.nextLine();
            if (city.equals("Stop")) break;
            switch (city){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Испания");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
            }
        }
    }
}
