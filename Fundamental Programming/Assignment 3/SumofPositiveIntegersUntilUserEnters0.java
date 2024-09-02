package Assignment3;

import java.util.Scanner;

public class SumofPositiveIntegersUntilUserEnters0 {
    public static void main(String[]Args){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter series of integer (Enter 0 to stop)");
         while (true){
             number = scanner.nextInt();

             if(number == 0){
                 break;
             }
             if(number > 0){
                 sum = sum + number;
             }
         }

         System.out.println("The Sum of Positive Integer is : " + sum);
         scanner.close();
    }
}
