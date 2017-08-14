import java.util.Arrays;

public class task10 {
    public static void main(String[] args) {
        int num = 641457;

        String lengthNum = String.valueOf(num);

        for (int i = 0; i < lengthNum.length(); i++) {

            System.out.print(num % 10);
            num = num / 10;
        }
    }
}
