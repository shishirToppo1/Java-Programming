package Assignment4;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String ");
        String input = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(input);
        String reversed = stringBuilder.reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }
}
