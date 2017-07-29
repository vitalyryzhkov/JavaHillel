import java.util.Scanner;

public class task4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину прямоугольника: ");
        int a = scanner.nextInt();
        System.out.println("Введите высоту прямоугольника: ");
        int b = scanner.nextInt();

        for (int j = 0; j < a; j++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < b; i++) {
            System.out.printf("*" + ("%" + (a-1) + "s%n"),  "*");
        }
        for (int j = 0; j < a; j++) {
            System.out.print("*");
        }
    }
}


