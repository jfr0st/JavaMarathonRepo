package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbersForDay16");
        int count = 0;
        double sum = 0;

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            sum += Integer.parseInt(scanner.nextLine());
            count++;
        }
        System.out.format("Полная запись вещественного числа: " + sum/count +
                "\nСокращенная запись: " + "%.3f%n", sum/count);
    }
}
