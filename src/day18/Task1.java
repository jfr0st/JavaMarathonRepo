package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] number = {5, 7, 8, 12, 17,1,50};

        System.out.println(sumNumbew(number.length,number));
    }

   /* public static void sumNumber(int [] array){
        return array[array.length - 1] + sumNumber();
    } */

    public static int sumNumbew(int i, int[] array){
        if(i == 0) return 0;
        i = i - 1;
        return array[i] + sumNumbew(i,array);

    }

}
