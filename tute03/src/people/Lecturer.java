package people;

import java.util.Map;

public class Lecturer extends Person {
    public static final Map<String, Integer> PAY_RATES = Map.of(
        "LVL0", 0,
        "LVL1", 1000,
        "LVL2", 2000,
        "LVL3", 3000
    );

    private int salary;

    public Lecturer(String name, int age, String payRate) {
        super(name, age);
        setSalary(payRate);
    }

    /**
     * Returns Lecturer's salary
     * 
     * @return salary in dollars per year
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of a person given their pay rate
     * @pre payRate is a valid pay rate
     * @param payRate New pay rate of the person
     * @post pay rate will be updated in Person
     */
    public void setSalary(String payRate) {
        Integer pay = PAY_RATES.get(payRate);
        this.salary = pay;
    }
}
