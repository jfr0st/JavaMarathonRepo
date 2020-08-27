package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = new int[100];


        for (int i = 0; i < myArray.length;i++){
            myArray[i] = (int) (Math.random() * 10001);
        }

        int max = myArray[0];
        int min = myArray[0];
        int count = 0;
        int sum = 0;

        for(int x : myArray){
            if (max < x) max = x;
            if (min > x) min = x;
            if (x % 10 == 0) {
                count++;
                sum += x;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
