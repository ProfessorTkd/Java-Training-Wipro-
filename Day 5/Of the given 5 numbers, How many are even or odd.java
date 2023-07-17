// Write a function that accepts 6 input parameters
// The first 5 input parameters are of type int
// The sixth input parameter is of type string If the sixth parameter contains the value "even", 
// the function is supposed to return the count of how many of the first five input parameters are even If the sixth parameter contains the value "add", 
// the function is supposed to return the count of how many of the first five input parameters are odd

// for example-
// If the five input parameters are 12, 17, 19, 14, and 116, and the sixth parameter is "odd", the function must return 3, 
// because there are three odd numbers 17, 19 and 115 

// it the five input parameters are 12, 17, 19, 14, and 115, and the sixth parameter is even, the function must return 2, 
// because there are two even numbers 12 and 14

// Note that zero is considered an even number

public class EvenOddCounter {
    public static int countNumbers(int num1, int num2, int num3, int num4, int num5, String type) {
        int count = 0;
        
        if (type.equals("even")) {
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
        } else if (type.equals("odd")) {
            if (num1 % 2 != 0) {
                count++;
            }
            if (num2 % 2 != 0) {
                count++;
            }
            if (num3 % 2 != 0) {
                count++;
            }
            if (num4 % 2 != 0) {
                count++;
            }
            if (num5 % 2 != 0) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        // Example usage
        int count = countNumbers(12, 17, 19, 14, 116, "odd");
        System.out.println("Count of odd numbers: " + count); // Output: 3
        
        count = countNumbers(12, 17, 19, 14, 115, "even");
        System.out.println("Count of even numbers: " + count); // Output: 2
    }
}
