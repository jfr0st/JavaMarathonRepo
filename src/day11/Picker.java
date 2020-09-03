package day11;

public class Picker implements Worker{

    private int salary;

    Warehouse wh = new Warehouse();

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void doWork(){
        salary += 80;
        wh.setCountOrder((wh.getCountOrder() + 1));
    }

    public void bonus(){
        if(wh.getCountOrder() == 1500){
            setSalary((getSalary() * 3));
        }
    }
}
