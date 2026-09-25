package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * Creates an Employee with the given name and salary.
     * 
     * @param name   The full name of the employee.
     * @param salary The employee's yearly salary in dollars.
     */
    public Employee(String name, int salary) {
        // this is bad
        // because if I decide to change logic, I have to change this as well.
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns the employee's name
     * 
     * @return The full name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name
     * 
     * @param name The employee's new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the employee's salary.
     * 
     * @return The employee's yearly salary in dollars.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the employee's salary.
     * 
     * @param salary The employee's yearly salary in dollars.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Returns the employee's identifier string.
     * 
     * @return The employee's attributes.
     */
    @Override 
    public String toString() {
        // this is bad
        // return "Employee" + "[name=" + name + ", salary=" + salary + "]";

        // this is good
        return getClass().getSimpleName() + "[name=" + name + ", salary=" + salary + "]";
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        }

        Employee other = (Employee) obj;
        return name.equals(other.name) && salary == other.salary;
    }
}
