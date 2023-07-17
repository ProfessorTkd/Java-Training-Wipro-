// Write a function that returns the last digit of the given number.
// Last digit is being referred to the least significant digit i.e. the digit in the ones (units) place in the given number.
// The last digit should be returned as a positive number.

// for example,
// if the given number is 197, the last digit is 7
// if the given number is -197, the last digit is 7


public class LastDigitFinder {
    public static int getLastDigit(int number) {
        int lastDigit = Math.abs(number % 10);
        return lastDigit;
    }

    public static void main(String[] args) {
        int inputNumber = -197;
        int result = getLastDigit(inputNumber);
        System.out.println("The last digit is: " + result);
    }
}
