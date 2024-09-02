package Assignment6;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number (1 - 7)");
        int DayNumber = scanner.nextInt();

        String Day = "";

         switch (DayNumber) {

             case 1:
                 Day = "Monday";
                 break;

             case 2:
                 Day = "Tuesday";
                 break;

             case 3:
                 Day = "Wednesday";
                 break;

             case 4:
                 Day = "Thursday";
                 break;

             case 5:
                 Day = "Friday";
                 break;

             case 6:
                 Day = "Saturday";
                 break;

             case 7:
                 Day = "Sunday";
                 break;
         }
        System.out.println("The Day is :" + Day);
        scanner.close();
    }
}
