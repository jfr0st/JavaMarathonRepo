package day11;

public class ClothesWarehouse extends Warehouse {

    @Override
    public String toString(){
        String str = "Колличество заказов: " + getCountOrder() + "\nДоход от заказов: "+ getBalance()+ "\nА бонусов тут нет за ними иди раьотать на обычный склад";
        return str;
    }

}
