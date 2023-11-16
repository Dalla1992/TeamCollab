package week9_assignments.darya;

public class FindMinimum {

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) { // iterating through array to find max
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3, 7};
        int maximum = findMax(numbers);
        System.out.println("The maximum number is: " + maximum);
    }
}


/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */
