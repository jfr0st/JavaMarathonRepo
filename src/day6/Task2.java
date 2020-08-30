package day6;

public class Task2 {
    public static void main(String[] args) {
        plane boeing = new plane("Boeing", 2017,54.9,186880);
        boeing.info();
        boeing.fillUp(500);
        boeing.info();
        boeing.fillUp(300);
        boeing.info();
        boeing.fillUp(200);
        boeing.info();
    }
}
