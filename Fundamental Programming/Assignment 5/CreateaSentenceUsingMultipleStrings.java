package Assignment5;

import java.util.Scanner;

public class CreateaSentenceUsingMultipleStrings {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String string1, string2, string3;

        System.out.println("\n Enter three strings to make Sentence \n");

        System.out.println("Enter 1st String :");
        string1 = scanner.nextLine();

        System.out.println("Enter 2nd String :");
        string2 = scanner.nextLine();

        System.out.println("Enter 3rd String :");
        string3 = scanner.nextLine();

        System.out.println("Your sentence is : " + string1 + " " +string2 + " " + string3 + "." );

    }
}
