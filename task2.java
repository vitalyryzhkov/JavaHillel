import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int amountNumbersInArray = scanner.nextInt();

        int[] a = new int[amountNumbersInArray];
        for (int i = 0; i < amountNumbersInArray; i++) {
            System.out.println("Введите число массива: ");
            a[i] = scanner.nextInt();
        }
        double b = 0;
        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        System.out.println("Среднее арифметическое: " + b / a.length);
    }
}
