package Assignment9;

import java.util.Scanner;

public class CheckNumberIsPrime {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }

        return true; // Number is prime
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the isPrime method and store the result
        boolean prime = isPrime(number);

        // Print whether the number is prime
        if (prime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
