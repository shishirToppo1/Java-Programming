package Assignment6;

import java.util.Scanner;

public class PrintAllCharactersExceptVowels {
    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string :");
        String input = scanner.nextLine();

        String lowerCaseInput =input.toLowerCase();

        for (int i = 0; i < input.length(); i++){
            char ch = lowerCaseInput.charAt(i);
            if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            System.out.println(ch);
        }
    }
}
