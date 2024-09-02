package Assignment2;
import java.util.Scanner;

public class FindtheLargestofTheeNumber {
    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the Second Number : ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the Third Number : ");
        int num3 = scanner.nextInt();

        if( num1 >= num2 && num1 >= num3){
            System.out.println(num1 +" First number is largest");
           } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is second number is largest");
            } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 +" Thired mumber is largest ");

        }
    }



}

