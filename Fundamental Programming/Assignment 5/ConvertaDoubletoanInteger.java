package Assignment5;

import java.util.Scanner;

public class ConvertaDoubletoanInteger {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number to convert into an Integer :");

        System.out.println("Enter a Number :");
        double doublenum = scanner.nextDouble();

        int IntoInt = (int)doublenum;

        System.out.println("Integer number : "+ IntoInt);
        scanner.close();

    }
}
