import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(averageTwoNums(a, b));
    }

    static double averageTwoNums(double a, double b) {
        return (a + b) / 2;
    }
}


