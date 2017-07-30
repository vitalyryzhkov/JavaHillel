import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Для того, чтобы получить желемый результат, необходимо ввести " +
                "два числа и ввести действие, которое Вы желаете с ними совершить: \n" +
                " \"+\" - прибавление\n \"-\" - вычитание\n \"*\" - умножение\n \"/\" - деление\n \"%\" - остаток от деления");

        System.out.println("Введите первое число: ");
        int value1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int value2 = scanner.nextInt();

        System.out.println("Введите действие: \n" +
                " \"+\" - прибавление\n \"-\" - вычитание\n \"*\" - умножение\n \"/\" - деление\n \"%\" - остаток от деления");
        String value3 = scanner.next();

        if (value3.equals("+")) {
            System.out.println(value1 + value2);
        } else if (value3.equals("-")) {
            System.out.println(value1 - value2);
        } else if (value3.equals("*")) {
            System.out.println(value1 * value2);
        }else if (value3.equals("/")) {
            System.out.println(value1 / value2);
        }else if (value3.equals("%")) {
            System.out.println(value1 % value2);
        }
    }

}


