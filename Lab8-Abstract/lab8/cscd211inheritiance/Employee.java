package lab8.cscd211inheritiance;

public abstract class Employee implements Comparable<Employee>{
    private double BASE; //base pay
    private String name;
    protected double salary; //base + additional

    public Employee(String name, double basePayrate, double additionalPayrate) {
        if (name == "" || basePayrate < 0 || additionalPayrate < 0){
            throw new IllegalArgumentException("string cannot be empty, and doubles cannot be less than 0");
        }
        if (name == null){
            throw new IllegalArgumentException("name cannot be null");
        }
        this.name = name;
        this.BASE = basePayrate;
        this.salary = additionalPayrate + getBaseSalary();

    }

    public double getBaseSalary(){
        return this.BASE;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.getClass().getSimpleName();
    }

    public abstract void report();
    public int compareTo(Employee another){
        if (another == null){
            throw new IllegalArgumentException("cannot be null");
        }
        if (this.getType().compareTo(another.getType()) == 0){
            return Double.compare(this.salary, another.salary);
        }
        return this.getType().compareTo(another.getType());
    }


    public double getBASE() {
        return BASE;
    }

    public String toString(){
        return this.name;
    }
}
