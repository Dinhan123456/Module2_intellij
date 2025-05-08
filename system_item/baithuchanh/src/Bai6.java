import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeapYear = true;
                }
            }else{
                isLeapYear = true;
            }
        }
        if (isLeapYear){
            System.out.println("The year " + year + " is a leap year!");
        }else{
            System.out.println("The year " + year + " is not a leap year!");
        }
    }
}
