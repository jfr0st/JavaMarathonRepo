package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("shoes.csv");
        File fileToWrite = new File("shoes0");
        PrintWriter printWriter = new PrintWriter(fileToWrite);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String shoesString = scanner.nextLine();
            String[] string = shoesString.split(";");
            if(Integer.parseInt(string[2]) == 0) printWriter.println(shoesString);
        }
        printWriter.close();

    }
}
