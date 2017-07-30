import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму денежного вклада в гривневом эквиваленте: ");
        double amountOfDeposit = scanner.nextDouble();

        System.out.println("Введите годовой %(процент) по вкладу: ");
        double annualPercentage = scanner.nextDouble();

        System.out.println("Срок вклада(в годах): ");
        int amountOfYears = scanner.nextInt();

        double percentsOfYear = amountOfDeposit * (annualPercentage / 100);
        double sumOfYear = amountOfDeposit + percentsOfYear;
        double percentsOfMonth = percentsOfYear / 12;
        double totalAmount = amountOfDeposit * (annualPercentage / 100) * amountOfYears + amountOfDeposit;
        System.out.format("Сумма накопленная месяц: %.2f %nПроценты за год: %.2f %nСумма накопленная за год: %.2f %n" +
                "Сумма к выдаче: %.2f %n", percentsOfMonth, percentsOfYear, sumOfYear, totalAmount);

//        System.out.format("Проценты за год: %.2f %n", percentsOfYear);
//        System.out.format("Сумма накопленная за год: %.2f %n", sumOfYear);
//        System.out.format("Сумма к выдаче: %.2f %n", totalAmount);
    }
}


