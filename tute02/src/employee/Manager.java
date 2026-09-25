package employee;

import java.time.LocalDate;

/*
Create a Manager subclass of Employee, that includes hire date.
What constructors are appropriate?
Is it appropriate to have a getter for the hire date? What about a setter?
Why might adding certain getters and setters be bad design?
*/
public class Manager extends Employee {
    private LocalDate hireDate;

    /**
     * Creates a Manager with the given name and salary and hire date.
     * 
     * @param name     The full name of the manager.
     * @param salary   The manager's yearly salary in dollars.
     * @param hireDate The manager's date of hire
     */
    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    /**
     * Creates a Manager with the given name and salary and 
     * current date as the date of hire.
     * 
     * @param name     The full name of the manager.
     * @param salary   The manager's yearly salary in dollars.
     */
    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    /**
     * Returns the manager's hire date.
     * 
     * @return The manager's hire date as a date.
     */
    public LocalDate getHireDate() {
        return hireDate;
    }

    /**
     * Returns the manager's identifier string.
     * 
     * @return The manager's attributes.
     */
    @Override 
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!super.equals(obj)) {
            return false;
        }

        Manager other = (Manager) obj;
        return hireDate.equals(other.hireDate);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("boss man", 100);
        Employee employee2 = new Manager("boss man", 100);
        
        System.out.println(employee1.equals(employee2));

    }
}
