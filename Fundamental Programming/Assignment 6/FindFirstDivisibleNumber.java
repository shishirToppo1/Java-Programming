package Assignment6;

import java.util.Scanner;

public class FindFirstDivisibleNumber {
    public static void main(String[]Args){
        for(int i = 1; i <= 100;i++){
            if (i % 3 == 0 && i % 7 == 0 ){
                System.out.println("The first divisible by both 3 and 7 : "+ i);
                break;
            }
        }
    }
}
