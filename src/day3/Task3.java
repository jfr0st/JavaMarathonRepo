package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double x;
        double y;
        for(int i = 1;i<=5;i++){
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble();
            y = sc.nextDouble();
            if (y == 0){
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(x / y);
        }
    }
}
