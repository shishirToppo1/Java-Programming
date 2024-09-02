package Assignment5;

import java.util.Scanner;

public class CalculatetheSquareRootofaNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number ");// user input
        double num =scanner.nextDouble();


        double squareRoot = Math.sqrt(num);
        System.out.println("Square root of " + num + " is " + squareRoot);

        scanner.close();


    }
}
