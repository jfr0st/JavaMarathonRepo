package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numberForDay16Task2");
        File file2 = new File("numberForDay16Task2File2");
        PrintWriter writeFile = new PrintWriter(file);
        PrintWriter writeFile2 = new PrintWriter(file2);
        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file2);
        int count = 0;
        int sum = 0;

        for(int i = 0 ;i < 1000;i++){
            writeFile.println((int)(Math.random()*101));
        }
        writeFile.close();

        while (scanner.hasNext()){
            sum += Integer.parseInt(scanner.nextLine());
            count++;
            if(count == 20){
                writeFile2.println((double) sum/count);
                sum = 0;
                count = 0;
            }
        }
        writeFile2.close();

        double d = 0;
        while (scanner2.hasNext()){
            d += Double.parseDouble(scanner2.nextLine());
        }

        System.out.println(d);
        System.out.println((int)d);
    }
}
