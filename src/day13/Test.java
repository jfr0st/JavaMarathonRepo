package day13;

public class Test {
    public static void main(String[] args) {
        User mike = new User("Майк");
        User jho = new User("Джо");
        User lebovski = new User("Лебовски");
        mike.subscribe(jho);
        jho.subscribe(mike);
        System.out.println("Подписан ли Джо на Майка: " + jho.isSubscribed(mike));
        System.out.println( "Друзья ли Джо и Майк: " + jho.isFriend(mike));
        System.out.println("Подписан ли Лебовски на Майка: " + lebovski.isSubscribed(mike));
        System.out.println( "Друзья ли Лебовски и Майк: " + lebovski.isFriend(mike));
        System.out.println();

        mike.sendMessage(jho,"Привет!");
        mike.sendMessage(jho,"Ты как там?");
        jho.sendMessage(mike,"Хай");
        jho.sendMessage(mike,"Норм");
        jho.sendMessage(mike,"Есть один вопрос к тебе... ");
        lebovski.sendMessage(mike,"Привет");
        lebovski.sendMessage(mike,"Тебе Джо не писал?");
        lebovski.sendMessage(mike,"Он меня искал просто");
        lebovski.sendMessage(mike,"Спрашивал про какие то деньги");
        mike.sendMessage(lebovski,"Да, писал");
        mike.sendMessage(lebovski,"я тоже тебя ищу, есть вопрос!");
        mike.sendMessage(lebovski,"Где деньги, Лебовски!?!?!?!");

        MessageDatabase.showDialog(mike,lebovski);

    }
}
