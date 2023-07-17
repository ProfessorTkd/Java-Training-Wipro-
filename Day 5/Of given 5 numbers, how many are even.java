// Write a function that accepts & input parameters and returns the count of how many of those 5 are even

// For example,
// the five input parameters are 12, 17, 19, 14, and 115, 
// there are two even numbers 12 and 14. 
// So, the function must return 2. 
// if the five input parameters are 15, 0, -12, 19, and 28, there are three even numbers

// Similarly,
// 0,-12 and 28. So, the function must return 3.
  
// Observe that zero is also considered an even number

public class EvenNumberCounter {
    public static int countEvenNumbers(int num1, int num2, int num3, int num4, int num5) {
        int count = 0;
        
        if (num1 % 2 == 0) {
            count++;
        }
        if (num2 % 2 == 0) {
            count++;
        }
        if (num3 % 2 == 0) {
            count++;
        }
        if (num4 % 2 == 0) {
            count++;
        }
        if (num5 % 2 == 0) {
            count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        // Example usage
        int count = countEvenNumbers(12, 17, 19, 14, 115);
        System.out.println("Count of even numbers: " + count); // Output: 2
        
        count = countEvenNumbers(15, 0, -12, 19, 28);
        System.out.println("Count of even numbers: " + count); // Output: 3
    }
}
