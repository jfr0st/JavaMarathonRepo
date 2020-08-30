package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 7) countPlayers++;
        else countPlayers = 6;

    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }

    public void run(){
        if (this.stamina > 0){
            this.stamina -= 1;
           // System.out.println(this.stamina);
        }
        if (this.stamina == MIN_STAMINA){
            System.out.println("Игрок не может больше бежать. Нужен отдых.");
            setCountPlayers(countPlayers - 1);
        }
    }

    public static void info(){
        int freePlayers = 6 - countPlayers;
        if (countPlayers == 6) System.out.println("Мест в командах больше нет" +
                "\nКолличество игроков на поле:  " +  countPlayers);
        if (countPlayers < 6){
            if (freePlayers > 1) System.out.println("Команды не полные, еще есть " + freePlayers + " свободных места. " +
                    "\nКолличество игроков на поле:  " +  countPlayers);
            else System.out.println("Команды не полные, еще есть " + freePlayers + " свободное место." +
                    "\nКолличество игроков на поле:  " +  countPlayers);
        }
    }
}
