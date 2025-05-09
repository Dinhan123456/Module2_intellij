import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien: ");
        money = scanner.nextDouble();
        System.out.println("Nhap so thang: ");
        month = scanner.nextInt();
        System.out.println("Nhap so lai xuat: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i <= month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
            System.out.println("Tu thang " + (i + 1) + " tu " + (i + 12) + " thang, lai xuat la " + totalInterest);
        }
    }
}
