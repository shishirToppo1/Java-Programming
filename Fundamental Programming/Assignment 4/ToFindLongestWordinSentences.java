package Assignment4;

import java.util.Scanner;

public class ToFindLongestWordinSentences {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sentences to find Longest Word :");
        String sentence = scanner.nextLine();

        String[] words= sentence.split("");

        String longestWord = " ";
        int maxLength = 0;

        for (String word : words) {
            // If the current word is longer than the longest word found so far
            if (word.length() > maxLength) {
                // Update the longest word and its length
                longestWord = word;
                maxLength = word.length();
            }
        }

        System.out.println("Longest Word : " + longestWord);

    }
}
