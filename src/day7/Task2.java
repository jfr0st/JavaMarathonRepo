package day7;

public class Task2 {
    public static void main(String[] args) {
        Player.info();
        Player player1 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();
        Player player2 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();
        Player player3 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();
        Player player4 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();
        Player player5 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();
        Player player6 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();
        Player player7 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();
        Player player8 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();

        System.out.println();

        while (player1.getStamina() !=0){
            player1.run();
        }
        Player.info();

        System.out.println();

        while (player2.getStamina() !=0){
            player2.run();
        }
        Player.info();

        System.out.println();

        Player player9 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();

        Player player10 = new Player((int)(Math.random()* (101-90) + 90));
        Player.info();

    }
}
