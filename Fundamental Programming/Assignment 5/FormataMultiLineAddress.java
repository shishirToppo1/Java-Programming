package Assignment5;

import java.util.Scanner;

public class FormataMultiLineAddress {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Street : ");
        String street = scanner.nextLine();

        System.out.println("Enter your City : ");
        String city = scanner.nextLine();

        System.out.println("Enter your Zip code : ");
        String zipcode = scanner.nextLine();

        scanner.close();

        System.out.println("\nStreet :\t"+street +"\n City :\t"+ city +"\n Zip code :\t"+zipcode );
    }
}
