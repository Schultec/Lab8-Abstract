package lab8.cscd211inheritiance;

public class Lawyer extends Employee {

    private int stockOptions;
    public Lawyer(String name, double basePayrate, double additionalPayrate, int stockOptions) {
        super(name, basePayrate, additionalPayrate);
        this.stockOptions = stockOptions;
    }
    public int getStockOptions(){
        return this.stockOptions;
    }
    public void report(){
        System.out.println("I am an lawyer. I get " + this.getSalary() + " and i have " + this.getStockOptions() + " shares of stock.");
    }
    public String toString(){
        return "Lawyer: " + super.toString();
    }
}
