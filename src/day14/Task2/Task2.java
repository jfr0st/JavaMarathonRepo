package day14.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws AgeException{
        List<String> peopels = new ArrayList<>();
        File file = new File("people");
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                peopels.add(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        for(String str : peopels){
            String[] line = str.split(" ");
            int age = Integer.parseInt(line[1]);
            if(age < 0) throw new AgeException("Некорректный входной файл");
            line = null;
        }
        System.out.println(peopels);
    }
}
