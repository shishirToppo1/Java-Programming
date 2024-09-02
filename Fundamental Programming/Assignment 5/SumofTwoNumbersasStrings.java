package Assignment5;

import java.util.Scanner;

public class SumofTwoNumbersasStrings {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String num1, num2;

        System.out.println("Enter two number to Sum :");

        System.out.println("Enter 1st Number :");
        num1 = scanner.nextLine();

        System.out.println("Enter 2nd Number :");
        num2 = scanner.nextLine();

        int num1toInt = Integer.parseInt(num1);
        int num2toInt = Integer.parseInt(num2);

        int sum = num1toInt + num2toInt;
        System.out.println(" Sum fo two Number is :" + " " + sum);
    }
}
