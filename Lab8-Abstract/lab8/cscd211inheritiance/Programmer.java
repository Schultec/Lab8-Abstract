package lab8.cscd211inheritiance;

public class Programmer extends Employee {

    private boolean busPass;
    public Programmer(String name, double basePayrate, double additionalPayrate, boolean b) {
        super(name, basePayrate, additionalPayrate);
        this.busPass = b;
    }
    public boolean getBusPass(){
        return this.busPass;
    }
    public void report(){
        if (this.getBusPass()){
            System.out.println("I am a programmer. I get " + this.getSalary() + " and I get a bus pass")
        }else{
            System.out.println("I am a programmer. I get " + this.getSalary() + " and I do not get a bus pass")
        }
    }

    public String toString(){

    }
}
