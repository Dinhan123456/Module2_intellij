import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the circle");
        System.out.println("4. Quit");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the circle");
                System.out.println("   ***   ");
                System.out.println(" *     * ");
                System.out.println("*       *");
                System.out.println("*       *");
                System.out.println(" *     * ");
                System.out.println("   ***   ");
                break;
            case 4:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("No valid choice, please try again.");
        }

    }

}
