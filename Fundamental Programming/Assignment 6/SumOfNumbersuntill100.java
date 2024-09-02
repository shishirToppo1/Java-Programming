package Assignment6;

import java.util.Scanner;

public class SumOfNumbersuntill100 {
    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter Number : ");

        while (true){
            number = scanner.nextInt();

            if (number > 0){
                sum += number;
                if (sum == 100){
                    break;
                }
            }
            else {
                break;
            }
        }System.out.println("Sum of entered number is : "+ sum);
        scanner.close();
    }
}
