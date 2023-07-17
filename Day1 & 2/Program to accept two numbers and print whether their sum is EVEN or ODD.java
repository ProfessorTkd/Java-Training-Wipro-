import java.util.Scanner;

public class EvenOddSumChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        if (sum % 2 == 0) {
            System.out.println("The sum is even.");
        } else {
            System.out.println("The sum is odd.");
        }
    }
}
