package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double x;
        double y;
        for(;;){
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble();
            y = sc.nextDouble();
            if (y == 0) break;
            System.out.println(x / y);
        }
    }
}
