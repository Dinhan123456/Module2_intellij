import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so (0 - 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("So ngoai pham vi (0 - 999)");
        } else if (number == 0) {
            System.out.println("zero");
        } else if (number < 100) {
            System.out.println(readTwoDigits(number));
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;

            String result = readOneDigit(hundreds) + " hundred";

            if (remainder != 0) {
                result += " and " + readTwoDigits(remainder);
            }

            System.out.println(result);
        }
    }

    public static String readTwoDigits(int number) {
        if (number == 0) {
            return "";
        } else if (number > 0 && number < 10) {
            return readOneDigit(number);
        } else if (number >= 10 && number < 20) {
            return readTeen(number);
        } else {
            int tens = number / 10;
            int ones = number % 10;

            if (ones == 0) {
                return readTens(tens);
            } else {
                return readTens(tens) + " " + readOneDigit(ones);
            }
        }
    }

    public static String readOneDigit(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String readTeen(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String readTens(int number) {
        switch (number) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
}
