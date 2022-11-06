package lab8.cscd211inheritiance;

public class Accountant extends Employee {

    private double parkingStipend;
    public Accountant(String name, double basePayrate, double additionalPayrate, double parkingStipend) {
        super(name, basePayrate, additionalPayrate);
        this.parkingStipend = parkingStipend;
    }
    public double getParkingStipend(){
        return this.parkingStipend;
    }
    public void report(){
        System.out.println("I am an accountant. I make" + this.getSalary() + " plus a parking stipend of " + this.getParkingStipend());
    }
    public String toString{
    }
}
