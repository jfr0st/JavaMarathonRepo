package day18;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(seven(777277757));

    }

    public static int seven(int x){
        if (x == 0) return 0;
        return ((x % 10 == 7) ? 1 : 0) + seven(x / 10);
    }
}
