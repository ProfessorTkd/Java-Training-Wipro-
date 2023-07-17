// Write a function to find whether the given input number is Even.
// If the given number is even, the function should return 2 else it should return 1.
// Note: The number passed to the function can be negative, positive or zero. Zero should be treated as Even.

public class EvenNumberChecker {
    public static int checkEven(int number) {
        if (number % 2 == 0) {
            return 2; // Even
        } else {
            return 1; // Odd
        }
    }

    public static void main(String[] args) {
        int inputNumber = 10;
        int result = checkEven(inputNumber);
        if (result == 2) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
