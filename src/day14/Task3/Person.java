package day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> parseFileToObjList()throws AgeException{
        List<Person> peopels = new ArrayList<>();
        List<String> peopelsStr = new ArrayList<>();
        File file = new File("people");
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                peopelsStr.add(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }

        for(String string : peopelsStr){
            String[] str = string.split(" ");
            if (Integer.parseInt(str[1]) < 0) throw new AgeException("Некорректный входной файл");
            peopels.add(new Person(str[0],Integer.parseInt(str[1])));
            str = null;
        }

        return peopels;
    }

    public static void main(String[] args)  {
        try {
            System.out.println(parseFileToObjList());
        }catch (AgeException e) {
            System.out.println(e);
        }

    }
}


