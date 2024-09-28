import java.util.Scanner;

public class Assignment2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        // Check a
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solutions.");
                } else {
                    System.out.println("No solution.");
                }
            } else {
                //bx + c = 0
                double x = -c / b;
                System.out.println("This is a linear equation. The result: x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                // Two distinct real roots
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct real roots: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                // One real root (double root)
                double x = -b / (2 * a);
                System.out.println("The equation has one real root: x = " + x);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-delta) / (2 * a);
                System.out.println("The equation has no real roots. The complex roots are:");
                System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
            }
        }
        scanner.close();
    }
}

