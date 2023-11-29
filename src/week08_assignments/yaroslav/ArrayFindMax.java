package week08_assignments.yaroslav;

public class ArrayFindMax {
    public static void main(String[] args) {

        /*
            Write a method that can find the maximum number from an int Array
         */
        System.out.println("{1, 2, 3, 4, 5} => " + findMaxNum(new int[]{1, 2, 3, 4, 5}));               //{1, 2, 3, 4, 5} => 5
        System.out.println("{5, 1, 5, 10, 5} => " + findMaxNum(new int[]{5, 1, 5, 10, 5}));             //{5, 1, 5, 10, 5} => 10
        System.out.println("{0} => " + findMaxNum(new int[]{0}));                                       //{0} => 0
        System.out.println("{-1, -2, -3, -4, -5} => " + findMaxNum(new int[]{-1, -2, -3, -4, -5}));    //{-1, -2, -3, -4, -5} => -1

    }

    public static int findMaxNum(int[] arr) {
        int maxNum = Integer.MIN_VALUE;

        for (int eachElement : arr) {
            if (eachElement > maxNum) {
                maxNum = eachElement;
            }
        }

        return maxNum;
    }

}

