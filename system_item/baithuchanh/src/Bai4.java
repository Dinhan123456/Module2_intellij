import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("x = %f!\n" + x);
        } else {
            if (b == c) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("The equation has no solution!");
            }
        }

    }
}
