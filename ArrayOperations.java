package ass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter the array elements? (yes/no): ");
        String userInput = scanner.nextLine().trim().toLowerCase();

        int[] array;

        if (userInput.equals("yes")) {
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            array = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
        } else {
            array = new int[]{23, 45, 12, 78, 34, 56};
            System.out.println("Using predefined array: " + Arrays.toString(array));
        }

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        double average = (double) sum / array.length;
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
