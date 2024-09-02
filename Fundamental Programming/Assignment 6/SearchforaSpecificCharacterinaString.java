package Assignment6;

import java.util.Scanner;

public class SearchforaSpecificCharacterinaString {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);


        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if ( ch == searchChar) {
                System.out.println("Character '" + searchChar + "' found at index " + (i+1));
                break;
            }
        }


    }
}
