import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("The size must not be greater than 20.");
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.println("The array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        int max = arr[0];
        int index = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j;
            }
        }
        System.out.println("\nThe maximum element is: " + max + " at position: " + (index + 1));
    }
}
