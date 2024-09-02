package Assignment5;

import java.util.Scanner;

public class LargestDataTypeToSmallerDataType {
    public static void main(String[]args){

        Scanner scanner =new Scanner(System.in);

        System.out.println("Convert Largest Data Type to Smaller");
        System.out.println("Enter the Number in Long : ");
        long longNum = scanner.nextLong();

        byte intoByte = (byte)longNum;

        System.out.println("Byte no. : " + intoByte);
        scanner.close();
    }
}
