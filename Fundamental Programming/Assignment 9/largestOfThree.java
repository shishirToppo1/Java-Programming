package Assignment9;

import java.util.Scanner;

public class largestOfThree {
    public static  int findMaximum( int number1, int number2 , int number3){
        int max1 = Math.max(number1, number2);
        int maximum = Math.max(max1, number3);

        return maximum;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int number1, number2, number3;

        System.out.println("-------Maximum of three numbers-------");

        System.out.println("Enter the First number : ");
        number1 = scanner.nextInt();

        System.out.println("Enter the second number : ");
        number2 = scanner.nextInt();

        System.out.println("Enter the Second number : ");
        number3 = scanner.nextInt();

        System.out.println("The larest Number is : "+ findMaximum(number1,number2,number3));
    }
}
