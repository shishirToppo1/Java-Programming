package Assignment8;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the matrices
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] resultMatrix = new int[2][2];

        // Prompt user to input elements for the first matrix
        System.out.println("Enter elements for the first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Element at [%d][%d]: ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Prompt user to input elements for the second matrix
        System.out.println("Enter elements for the second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Element at [%d][%d]: ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the resulting matrix
        System.out.println("Resulting matrix after addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}
