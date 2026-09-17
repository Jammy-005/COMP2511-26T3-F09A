package example;

import java.util.Scanner;

/*
Inside a new file called Sum.java, write a program that uses the Scanner class which reads in a 
line of numbers separated by spaces, and sums them.
*/
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        System.out.println("Sum is " + sum);
        scanner.close();
    }
}
