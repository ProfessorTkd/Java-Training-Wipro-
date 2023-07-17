// Write a function that accepts two parameters and finds whether the first parameter is an exact multiple of the second parameter. 
// If the first parameter is an exact multiple of the second parameter, 
// the function should return 2 else it should return 1. If either of the parameters are zero, the function should return 3.

// Assumption: Within the scope of this question, assume that -
// -the first parameter can be positive, negative or zero
// -the second parameter will always be >=0

public class MultipleChecker {
    public static int checkMultiple(int N, int M) {
        if (N == 0 || M == 0) {
            return 3;
        } else if (N % M == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int N = 10;
        int M = 5;
        int result = checkMultiple(N, M);
        System.out.println("Result: " + result); // Output: Result: 2

        N = 7;
        M = 3;
        result = checkMultiple(N, M);
        System.out.println("Result: " + result); // Output: Result: 1

        N = 0;
        M = 10;
        result = checkMultiple(N, M);
        System.out.println("Result: " + result); // Output: Result: 3
    }
}
