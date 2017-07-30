import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Is digit " + a + " even? " + "It`s " + IsEven(a));
    }

    public static boolean IsEven(int a) {
        int result = a % 2;
        return result == 0;
    }
}



