import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int size;
        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("The does not 20");
        }while (size > 20);
        int[] arr = new int[21];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the element to insert: ");
        int X = scanner.nextInt();
        int index = scanner.nextInt();
        if (index < 0 || index > size) {
            System.out.println("The index is out of range");
        }else {
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = X;
            size++;
            System.out.println("The array is: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
