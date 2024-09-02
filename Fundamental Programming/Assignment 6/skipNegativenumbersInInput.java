package Assignment6;

import java.util.Scanner;

public class skipNegativenumbersInInput {
    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);

        int sum =0;
        int number;

        System.out.println("------Skip Negative Numbers-----");
        System.out.println("Enter the Numbner : ");

        while (true){
            number = scanner.nextInt();

            if (number > 0){
                sum += number;
            }else if (number < 0) {
                continue;
            }else {
                break;
            }
        }
        System.out.println("Sum of Entered Number is : "+ sum);
        scanner.close();
    }
}
