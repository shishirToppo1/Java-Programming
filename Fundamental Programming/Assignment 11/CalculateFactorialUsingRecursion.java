package Assignment11;


import java.util.Scanner;

public class CalculateFactorialUsingRecursion {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the factorial using the recursive method
            int result = factorial(number);

            // Print the result
            System.out.println("The factorial of " + number + " is " + result);
        }

        // Close the scanner object
        scanner.close();
    }
}