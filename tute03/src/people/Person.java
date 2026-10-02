package people;

import java.util.Map;

public abstract class Person {
    private String name;
    private int age;

    /**
     * Constructor for the Person given their name, age and payrate
     * @pre name will have a first name and last name
     * @pre age >= 0
     * @pre payRate is a valid pay rate
     * @param name full name
     * @param age in years
     * @param payRate in dollars per year
     * @post valid Person is created
     */
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    /**
     * Get Person's name
     * @return full name
     * @post name that has first name and last name in it
     */
    public String getName() {
        return name;
    }

    /**
     * @pre name will have a first name and last name
     * @param name full name
     * @post name will be updated in Person
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
