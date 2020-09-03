package day11;

public class Courier implements Worker {

    private int salary;

    Warehouse whC = new Warehouse();

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void doWork(){
        salary+=100;
        whC.setBalance((whC.getBalance() + 1000));

    }

    public void bonus(){
        if(whC.getBalance() == 1000000){
            setSalary((getSalary() * 2));
        }
    }
}
