import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String lengthNum = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < lengthNum.length(); i++) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
//        int result = num % 10 + num / 10 % 10 + num / 100;
//        System.out.println(result);
    }
}
