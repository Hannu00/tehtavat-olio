import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number for a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number for b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number for c: ");
        double c = Double.parseDouble(scanner.nextLine());

        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else {
            System.out.println("No real roots.");
        }
    }
}