import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("The does not 20");
        }while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter the element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("The array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = temp;
        }
        System.out.println("\nThe reversed array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
