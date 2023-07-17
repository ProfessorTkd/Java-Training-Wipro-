// Write a function that returns the second last digit of the given number.
// Second last digit is being referred to the digit in the tens place in the given number.

// for example,
// if the given number is 197, the second last digit is 9

// Note1 - The second last digit should be returned as a positive number.
// i.e. if the given number is -197, the second last digit is 9

// Note2 - If the given number is a single digit number, then the second last digit does not exist. In such cases, the function should return -1.
// i.e. if the given number is 5, the second last digit should be returned as -1


public class SecondLastDigitFinder {
    public static int getSecondLastDigit(int number) {
        int absoluteNumber = Math.abs(number);
        int secondLastDigit = -1;

        if (absoluteNumber > 9) {
            int tensPlace = (absoluteNumber / 10) % 10;
            secondLastDigit = tensPlace;
        }

        return secondLastDigit;
    }

    public static void main(String[] args) {
        int inputNumber = -197;
        int result = getSecondLastDigit(inputNumber);
        System.out.println("The second last digit is: " + result);
    }
}
