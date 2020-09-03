package day11;

public class Warehouse {
    private static int countOrder = 0;
    private static int balance = 0;

    public int getCountOrder() {
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString(){
        String str = "Колличество заказов: " + getCountOrder() + "\nДоход от заказов: "+ getBalance();
        return str;
    }
}
