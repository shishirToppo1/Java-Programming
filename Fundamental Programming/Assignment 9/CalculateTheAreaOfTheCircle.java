package Assignment9;

import java.util.Scanner;

public class CalculateTheAreaOfTheCircle {
    public static double CalculateArea(double radius){
        //Calculate the Area of Circle
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.println("Enter the Radius of the Circle : ");
        double radius = scanner.nextDouble();
        double area = CalculateArea(radius);



        System.out.println("The Area of the circle : " + area );
        scanner.close();
    }
}
