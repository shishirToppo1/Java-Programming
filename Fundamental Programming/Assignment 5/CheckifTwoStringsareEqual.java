package Assignment5;

import java.util.Scanner;

public class CheckifTwoStringsareEqual {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 1st Number ");
        String firstString = scanner.nextLine();

        System.out.println("Enter 2nd Number");
        String secondString = scanner.nextLine();

        boolean equal = firstString.equals(secondString);
        System.out.println("Equal number :"+ equal);
    }
}
