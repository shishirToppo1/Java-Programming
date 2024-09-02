package Assignment4;

import java.util.Scanner;

public class CounttheNumberofVowelsandConsonants {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any Strings");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantsCount = 0;

        String intoLowerCase = input.toLowerCase();

        for(int i = 0; i < intoLowerCase.length(); i++){
            char currentChar= intoLowerCase.charAt(i);
            if(Character.isLetter(currentChar)){
                if ( currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'){
                    vowelCount++;
                }else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Number of vowel : "+ vowelCount);
        System.out.println("Number of consonants : "+ consonantsCount);
    }
}
