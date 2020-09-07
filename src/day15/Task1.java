package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> shoesArray = new ArrayList<>();

        File file = new File("shoes.csv");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String shoesStrimg = scanner.nextLine();
            String[] string = shoesStrimg.split(";");
            if(Integer.parseInt(string[2]) == 0) shoesArray.add(shoesStrimg);
        }

        for(String str : shoesArray){
            System.out.println(str);
        }
    }
}
