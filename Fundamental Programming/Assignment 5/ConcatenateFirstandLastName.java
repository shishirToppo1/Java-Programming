package Assignment5;

import java.util.Scanner;

public class ConcatenateFirstandLastName {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;

        System.out.println("Enter your first Name : ");
        firstName = scanner.nextLine();

        System.out.println("Enter your Last Name : ");
        lastName = scanner.nextLine();

        scanner.close();
        System.out.println("Full name :" + firstName.concat(lastName));
    }
}
