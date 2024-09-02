package Assignment10;

import java.util.Scanner;

public class OverloadingCalculatingArea {
    //Area of circle
    public static double CalculateArea(double radius){
        return Math.PI*radius*radius;
    }
    //area of reactangle
    public static double CalculateArea(double length ,double width){
        return length * width;
    }

    //method of calculate area of Triangle
    public static double CalculateArea(float base, float height){
        return 0.5 * base * height;
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Choose a shape to calculate the area :");
        System.out.println("1) Circle");
        System.out.println("2) Rectangle");
        System.out.println("3) Triangle");
        System.out.println("chose 1 - 3 :");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter the radius of the circle : ");
                double radius = scanner.nextDouble();
                System.out.println("The Area of the Circle is : "+ CalculateArea(radius));
                break;

            case 2:
                System.out.println("Enter the length of rectangle : ");
                double length = scanner.nextDouble();
                System.out.println("Enter the Widht of Reactangle : ");
                double width = scanner.nextDouble();

                System.out.println("The Area of the Reactangle is : "+ CalculateArea(length,width));
                break;

            case 3:
                System.out.println("Enter the Base of Triangle : ");
                float base = scanner.nextFloat();
                System.out.println("Enter the Hight of Triangle : ");
                float hight = scanner.nextFloat();

                System.out.println("The Area of the Triangle is : " + CalculateArea(base,hight));
                break;
        }

    }
}
