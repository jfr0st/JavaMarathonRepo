package day14.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws UncorrectedExcept {
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int count = 0;
        try {
            File file = new File("numbers");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                count++;
                numbers.add(Integer.parseInt(scanner.nextLine()));
            }
            if(numbers.size() != 10) throw new UncorrectedExcept("Некорректный входной файл");
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        }

        for(Integer list : numbers){
            sum +=list;
        }

        System.out.println(sum);

    }
}

