import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen to: ");
        int n = scanner.nextInt();
        if (n < 2){
            System.out.println("Khong phai so nguyen to");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("So nguyen to " + n);
            }else {
                System.out.println("Khong so nguyen to " + n);
            }
        }
    }
}
