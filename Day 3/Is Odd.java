
// Write a function to find whether the given input number is Odd.
// If the given number is odd, the function should return 2 else it should return 1.
// Note: The number passed to the function can be negative, positive or zero. Zero should NOT be treated as odd.


public class OddNumberChecker {
    public static int checkOdd(int number) {
        if (number % 2 != 0) {
            return 2; // Odd
        } else {
            return 1; // Even
        }
    }

    public static void main(String[] args) {
        int inputNumber = 11;
        int result = checkOdd(inputNumber);
        if (result == 2) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }
    }
}
