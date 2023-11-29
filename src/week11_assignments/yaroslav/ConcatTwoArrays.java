package week11_assignments.yaroslav;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {

        /*
                    Write a return method that can concatenate two arrays
         */
        System.out.println(concatTwoArrays(new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 8, 9, 10}));  //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(concatTwoArrays(new int[]{}, new int[]{7, 8, 9, 10}));  //[7, 8, 9, 10]
        System.out.println(concatTwoArrays(new int[]{}, new int[]{}));  //[]
    }

    public static String concatTwoArrays(int[] arr1, int[] arr2) {
        int index = 0;
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[index] = arr2[i];
            index++;
        }
        return Arrays.toString(newArr);
    }
}
