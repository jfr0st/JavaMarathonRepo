package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length;i++){
            myArray[i] = (int) (Math.random() * 10001);
        }

        /*for(int x : myArray){
            System.out.print(x + " ");
        }*/

        int sum = 0;
        int maxSum = 0;
        int index = 0;
        for(int i = 0; i < myArray.length - 2;i++){
            sum = myArray[i] + myArray[i+1] + myArray[i+2];
            if (maxSum < sum){
                maxSum = sum;
                index = i;
            }
            sum = 0;
        }
        //System.out.println();
       /* System.out.println("Тройка с максимальной суммой: " + "[" + myArray[index] + " " +
                myArray[index+1] + " " + myArray[index+2]+ "]"); */
        System.out.println("Максимальная сумма:" + maxSum);
        System.out.println("Индекс первого элемента тройки: " + index);


    }
}
