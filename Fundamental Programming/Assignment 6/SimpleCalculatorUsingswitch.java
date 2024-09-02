package Assignment6;

import java.util.Scanner;

public class SimpleCalculatorUsingswitch {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter first Number :");
        double num1 = scanner.nextDouble();

        System.out.println("enter Second Number :");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an Operator (+, -,*,/) :");
        char operator =scanner.next().charAt(0);

        double result = 0;

        switch (operator){
            case '+':
            result = num1 + num2;
            System.out.println("Sum of " +num1 +" and "+num2 +" is :" + result);
            break;

            case '-':
            result = num1 - num2;
            System.out.println("Diffrence of " +num1 +" and " + num2 +" is :"+ result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println("Product of " + num1+" and "+num2+" is :"+ result);
            break;

            case '/':
            result = num1 / num2;
            System.out.println("Quotiont of "+ num1+ " and "+ num2+ " is :"+ result);
            break;


        }
        scanner.close();
    }
}
