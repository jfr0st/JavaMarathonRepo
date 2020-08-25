package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = x + 1; i < y - 1;i++){
            if (i % 5 == 0 && i % 10 != 0) System.out.print(i + " ");
        }
    }
}
