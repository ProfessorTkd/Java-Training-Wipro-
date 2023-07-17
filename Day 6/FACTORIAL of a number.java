// In mathematics, the factorial of a non-negative integer n, denoted by nt, is the product of all positive integers less than or equal to n. For example,

// 5-5x4x3x2x1 = 120 41-4x3x2x1=24
// 9-9x8x7x6 5x4 x 3 x2 x1x 362880

// Write a program to find the factorial of a given number The given number will be passed to the function as an input parameter of type int 
// The function is expected to calculate the factorial of the given number and return it as an int type

// Assumptions for this program:
// The given input number will always be greater than or equal to 1. Due to the range supported by int, the input numbers will range from 1 to 12


public class FactorialCalculator {
    public static int calculateFactorial(int number) {
        int factorial = 1;
        
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        
        return factorial;
    }

    public static void main(String[] args) {
        int number = 5;
        int factorial = calculateFactorial(number);
        
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
