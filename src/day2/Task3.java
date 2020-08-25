package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x + 1;

        while (z < (y - 1)){
            if (z % 5 == 0 && z % 10 != 0) System.out.print(z + " ");
            z++;
        }
    }
}
