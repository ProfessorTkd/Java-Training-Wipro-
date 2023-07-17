
// Write a function to return the nth number in the fibonacci series The value of N will be passed to the function as input parameter.

// NOTE: Fibonacci series looks like - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.

// Le Fibonacci series starts with 0 and 1, and continues generating the next number as the sum of the previous two numbers.
//first Fibonacci number is 0.
//second Fibonacci number is 1,
//third Fibonacci number is 1,
//fourth Fibonacci number is 2,
//fifth Fibonacci number is 3,
//sixth Fibonacci number is 5,
//seventh Fibonacci number is 8, and so on

public class Fibonacci {
    public static int nthFibonacci(int n) {
        if (n <= 0) {
            return -1; // Invalid input, return -1 as error value
        } else if (n == 1) {
            return 0; // First Fibonacci number is 0
        } else if (n == 2) {
            return 1; // Second Fibonacci number is 1
        }

        int prevPrev = 0; // Previous previous Fibonacci number
        int prev = 1; // Previous Fibonacci number
        int current = 0; // Current Fibonacci number

        for (int i = 3; i <= n; i++) {
            current = prevPrev + prev;
            prevPrev = prev;
            prev = current;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 6;
        int nthFibonacciNumber = nthFibonacci(n);

        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacciNumber);
    }
}
