package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] myArray = new int[12][8];

        for(int i=0;i<12;i++){
            for(int j=0;j<8;j++){
                myArray[i][j] = (int) (Math.random() * 51);
            }
        }

        int sum = 0;
        int max = 0;
        int index = 0;

        /*for(int i=0;i<12;i++){
            for(int j=0;j<8;j++){
                System.out.print(myArray[i][j]+ " ");
            }
            System.out.println();
        } */


        for(int i=0;i<12;i++){
            for(int j=0;j<8;j++){
                sum = sum + myArray[i][j];

            }
            if(sum >= max){
                max = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + index);
    }
}
