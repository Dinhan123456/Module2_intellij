import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the size of the array: ");
        int cols = scanner.nextInt();
        double[][] arr = new double[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element " + (i+1) + " " + (j+1) + ": ");
                arr[i][j] = scanner.nextDouble();
            }
        }
        double max = arr[0][0];
        int rowMax = 0, colsMax = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    rowMax = i;
                    colsMax = j;
                }
            }
        }
        System.out.println("The largest value is " + max + " at position (" + rowMax + ", " + colsMax + ")");
    }
}
