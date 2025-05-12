import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("The does not 20");
        }while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the element delete: ");
        int X = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == X) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Not found");
        }else {
            for (int i = index_del; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            arr[size] = 0;
            System.out.println("Deleted");
            System.out.println("The array is: ");
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("The array is delete: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
