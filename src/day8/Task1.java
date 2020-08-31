package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "0 ";
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 2000; i++){
            str = str +i + " ";
        }
        System.out.println(str);
        long finish = System.currentTimeMillis();
        long needForTime = finish - start;
        System.out.println("Время выполнения программы: " + needForTime);

        System.out.println();

        StringBuilder sb = new StringBuilder("0 ");
        long start2 = System.currentTimeMillis();
        for (int i = 1; i <= 2000; i++){
            sb.append(i + " ");
        }
        long finish2 = System.currentTimeMillis();
        System.out.println(sb);
        long needForTime2 = finish2 - start2;
        System.out.println("Время выполнения программы: " + needForTime2);
    }
}
