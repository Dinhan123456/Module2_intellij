import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in ra dau tien: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int i = 2;
        boolean check;
        while (count < numbers) {
            check = true;
            if (i > 2) {
                for (int j = 2; j < i; j++) {
                    if ( i % j == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                count++;
                System.out.printf(" " + i);
            }
            i++;
        }
    }

}
