import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of the upper-left corner");
        System.out.println("Enter x1");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1");
        int y1 = scanner.nextInt();

        System.out.println("Enter the coordinates of the bottom right corner");
        System.out.println("Enter x2");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2");
        int y2 = scanner.nextInt();

        System.out.println("Enter the coordinates of the point");
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();

        if ((x1 < x && x < x2) && (y1 < y && y < y2)) {
            System.out.println("The point belongs to the rectangle");
        } else {
            System.out.println("The point does not belong to the rectangle");
        }
    }
}
