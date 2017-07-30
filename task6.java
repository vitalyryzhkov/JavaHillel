import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (IsPrime(a)) System.out.println("Digit is prime");
        else System.out.println("Digit is not prime");
    }

    public static boolean IsPrime(int a) {

        for (int i = 2; i < a / 2 + 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}

