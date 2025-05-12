import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter a number 2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter the element " + (i+1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter the element " + (i+1) + ": ");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            arr3[size1 + i] = arr2[i];
        }
        System.out.println("The array is: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
