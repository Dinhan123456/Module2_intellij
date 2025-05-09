import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        int chieudai;
        int chieurong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hinh");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Chon hinh: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                System.out.print("Chieu dai: ");
                chieudai = scanner.nextInt();
                System.out.print("Chieu rong: ");
                chieurong = scanner.nextInt();
                for (int i = 1; i <= chieudai; i++) {
                    for (int j = 1; j <= chieurong; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
        }
    }
}
