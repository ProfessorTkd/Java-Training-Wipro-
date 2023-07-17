

// Write a function that finds and returns the Nth prime number. N will be passed as input to the function. 

//   Assumption: 1 <= N 1000, where N is the position of the prime number

// The first prime number is 2
// The second prime number is 3 
// The third prime number is 5
// The fourth prime number is 7
// The fifth prime number is 11 and so on. 
  
//   Example1: If the given number N is 10, the method must return the 10th prime 
//   Example2: if the given number N is 13, the method must return the 13th prime numberie 41


public class NthPrime {
    public static int nthPrime(int N) {
        if (N <= 0) {
            return -1; // Invalid input, return -1 as error value
        }

        int count = 0; // Count of prime numbers found so far
        int number = 2; // Current number being checked

        while (count < N) {
            if (isPrime(number)) {
                count++;
            }

            number++;
        }

        return number - 1; // Subtract 1 to get the Nth prime number
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }

        return true; // Number is prime
    }

    public static void main(String[] args) {
        int N = 10;
        int nthPrimeNumber = nthPrime(N);

        System.out.println("The " + N + "th prime number is: " + nthPrimeNumber);
    }
}
