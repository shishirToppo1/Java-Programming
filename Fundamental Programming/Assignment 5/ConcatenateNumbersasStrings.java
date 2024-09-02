package Assignment5;

import java.util.Scanner;

public class ConcatenateNumbersasStrings {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String num1,num2;

        System.out.println("Concatenate number as Syting :");

        System.out.println("Enter 1st number ");
        num1 = scanner.nextLine();

        System.out.println("Enter 2nd Number :");
        num2 = scanner.nextLine();

        String sum = num1 + num2;

        scanner.close();

        System.out.println("Sum of Concatenate Number as Strings :" + " " + sum);
    }
}
