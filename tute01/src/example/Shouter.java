package example;
/*
Inside a new file Shouter.java, write a program that stores a message and has methods 
for getting the message, updating 
the message and printing it out in all caps. Write a main() method for testing this class. */

public class Shouter {
    private String message;

    // Constructor
    public Shouter(String message) {
        this.message = message;
    }

    // Getting message
    public String getMessage() {
        return message;
    }

    // Update the message
    public void setMessage(String message) {
        this.message = message;
    }

    // Print message all in caps
    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("We so cool bro");
        System.out.println(shouter.getMessage());
        shouter.shout();
        shouter.setMessage("nooooooo");
        System.out.println(shouter.getMessage());;
    }
}
