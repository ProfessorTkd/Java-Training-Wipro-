// Write a function that accepts & input parameters and returns the count of how many of those 5 are odd


public class EvenNumberCounter {
    public static int countEvenNumbers(int num1, int num2, int num3, int num4, int num5) {
        int count = 0;
        
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
        
        return count;
    }
}
