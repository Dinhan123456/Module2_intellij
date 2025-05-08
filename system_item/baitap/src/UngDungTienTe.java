import java.util.Scanner;

public class UngDungTienTe {
    public static void main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Quy doi vnd: " + quydoi);
    }
}
