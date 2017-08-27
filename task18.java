import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter month: ");
        int monthIn = scanner.nextInt();

        int days;
        if (monthIn == 4 || monthIn == 6 || monthIn == 9 || monthIn == 11) {
            days = 30;
        } else if (monthIn == 2) {
            if (leapYear(year)) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            days = 31;
        }
        switch (monthIn) {
            case 1:
                System.out.printf("%s %d and %d days", Months.January, year, days);
                break;
            case 2:
                System.out.printf("%s %d and %d days", Months.February, year, days);
                break;
            case 3:
                System.out.printf("%s %d and %d days", Months.March, year, days);
                break;
            case 4:
                System.out.printf("%s %d and %d days", Months.April, year, days);
                break;
            case 5:
                System.out.printf("%s %d and %d days", Months.May, year, days);
                break;
            case 6:
                System.out.printf("%s %d and %d days", Months.June, year, days);
                break;
            case 7:
                System.out.printf("%s %d and %d days", Months.July, year, days);
                break;
            case 8:
                System.out.printf("%s %d and %d days", Months.August, year, days);
                break;
            case 9:
                System.out.printf("%s %d and %d days", Months.September, year, days);
                break;
            case 10:
                System.out.printf("%s %d and %d days", Months.October, year, days);
                break;
            case 11:
                System.out.printf("%s %d and %d days", Months.November, year, days);
                break;
            case 12:
                System.out.printf("%s %d and %d days", Months.December, year, days);
                break;
        }
    }

    public enum Months {
        January, February, March, April, May,
        June, July, August, September, October, November, December
    }

    private static boolean leapYear(int year) {
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
