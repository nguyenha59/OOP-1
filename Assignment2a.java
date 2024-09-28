import java.util.Scanner;
public class Assignment2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax + b = 0");
        System.out.print("Enter 'a': ");
        double a = scanner.nextDouble();
        System.out.print("Enter 'b': ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions");
            } else {
                System.out.println("No solution");
            }
        } else {
            double x = -b / a;
            System.out.println("Result: x = " + x);
        }
        scanner.close();
    }
}

