package lab8.cscd211comparators;

import lab8.cscd211inheritiance.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}
