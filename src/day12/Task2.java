package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> myIntegerList = new ArrayList<Integer>();

        for (int i = 0;i <= 350; i++){
            if(i <=30){
                if(i % 2 == 0){
                    myIntegerList.add(i);
                }
            }
            if(i >= 300 & i <= 350){
                if(i % 2 == 0){
                    myIntegerList.add(i);
                }
            }
        }

        System.out.println(myIntegerList);
    }
}
