
// Write a function that finds whether the given number N is Prime or not. If the number is prime, the function should return 2 else it must return 1.
// Assumption: 2 <= N=5000, where N is the given number.
// Example1: if the given number N is 7, the method must return 2
// Example2: if the given number N is 10, the method must return 1


public class PrimeChecker {
    public static int isPrime(int N) {
        if (N < 2) {
            return 1; // Numbers less than 2 are not prime
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 1; // N is divisible by i, so it's not prime
            }
        }

        return 2; // N is prime
    }

    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 10;

        System.out.println(isPrime(number1)); // Output: 2
        System.out.println(isPrime(number2)); // Output: 1
    }
}
