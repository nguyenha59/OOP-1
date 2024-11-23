package ass6;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter the matrices? (yes/no): ");
        String userInput = scanner.nextLine().trim().toLowerCase();

        int rows, cols;
        int[][] matrix1, matrix2, result;

        if (userInput.equals("yes")) {
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            cols = scanner.nextInt();

            matrix1 = new int[rows][cols];
            matrix2 = new int[rows][cols];

            System.out.println("Enter elements for Matrix 1:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element at position [" + (i + 1) + "," + (j + 1) + "]: ");
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements for Matrix 2:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element at position [" + (i + 1) + "," + (j + 1) + "]: ");
                    matrix2[i][j] = scanner.nextInt();
                }
            }
        } else {
            matrix1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            matrix2 = new int[][]{
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };

            rows = matrix1.length;
            cols = matrix1[0].length;

            System.out.println("Using predefined matrices.");
        }

        result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Matrix 1: " + Arrays.deepToString(matrix1));
        System.out.println("Matrix 2: " + Arrays.deepToString(matrix2));
        System.out.println("Resultant Matrix after addition: " + Arrays.deepToString(result));
        
        scanner.close();
    }
}
