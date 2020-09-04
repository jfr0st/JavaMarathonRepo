package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> myAvtoList = new ArrayList<String>();
        myAvtoList.add("BMW");
        myAvtoList.add("Audi");
        myAvtoList.add("Citroen");
        myAvtoList.add("Toyota");
        myAvtoList.add("Mazda");
        System.out.println("Изнчальный список: " + myAvtoList);

        myAvtoList.add(2,"Volvo");
        //System.out.println(myAvtoList);

        myAvtoList.remove(0);
        System.out.println("Измененный список: " + myAvtoList);
    }
}
