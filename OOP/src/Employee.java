//OOP: Encapsulation!
//Bundle the data and methods that operate on the data in a single unit.

import java.nio.channels.FileLockInterruptionException;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees;

    public Employee(int baseSalary) {   //constructors: we use constructor to initialize our objects.
        this(baseSalary, 0);
    }
    public Employee(int baseSalary, int hourlyRate) {   //constructors: we use constructor to initialize our objects.
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage() {
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {  //setters
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }


    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hours cannot be 0 or less");
        }
        this.hourlyRate = hourlyRate;
    }

}

//Abstraction:  Reduce complexity by hiding unnecessary details in our classes.
//coupling: The level of dependency between classes.

//method overloading: creating different implementation of it but with different parameters.

//static: we use static field in a situation that in which a value is independent of objects




