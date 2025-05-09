import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("dont");
        }
        while (a != b){
            if (a > b){
                a -= b;
            }else {
                b -= a;
            }
        }
        System.out.println("Uoc so chung lon nhat la: " + a);
    }
}
