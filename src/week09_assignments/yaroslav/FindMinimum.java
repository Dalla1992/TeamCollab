package week09_assignments.yaroslav;

public class FindMinimum {
    public static void main(String[] args) {

        //Write a method that can find the maximum number from an int Array

        System.out.println(findMax(new int[] {1, 2, 3, 4, 5}));   // 5
        System.out.println(findMax(new int[] {5, 5, 3, 1}));      // 5
        System.out.println(findMax(new int[] {33, 1, 2, 32}));    // 33
    }

    public static int findMax(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}
