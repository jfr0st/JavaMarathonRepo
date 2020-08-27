package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int massivSize = sc.nextInt();
        int countEight = 0;
        int countOne = 0;
        int countEven = 0;
        int sum = 0;


        int[] massiv = new int[massivSize];
        for (int i = 0; i < massiv.length;i++){
            massiv[i] = (int) (Math.random() * 11);
        }

        for (int m : massiv){
            System.out.print(m + " ");
            if(m > 8) countEight++;
            if(m == 1) countOne++;
            if(m % 2 == 0)countEven++;
            sum += m;
        }

        System.out.println();
        //длина массива
        System.out.println("Длина массива: " + massiv.length);
        //Кол-во чисел больше 8
        System.out.println("Количестве чисел больше 8: "+ countEight);
        //Кол-во чисел равных 1
        System.out.println("Количестве чисел равных 1: " + countOne);
        //Кол-во четных чисел
        System.out.println("Количестве четных чисел: " + countEven);
        //Кол-во неченых чисел
        System.out.println("Количестве нечетных чисел: " + (massiv.length - countEven));
        //Сумма всех элементов массива
        System.out.println("Сумме всех элементов массива: " + sum);
    }
}
