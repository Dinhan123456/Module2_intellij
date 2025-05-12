import java.util.Scanner;

public class ThucHanhDemSoLuongSinhVienDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("The does not 20");
        }while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter the element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int sum = 0;
        System.out.println("The array is: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
                if (arr[j] >= 5 && arr[j] <= 10)
                    sum++;
            }
            System.out.println("\nThe number of students in the range 5 to 10 is: " + sum);
    }
}
