package week9_assignments.yaroslav;

import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {

        /*
                Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
                Ex: int[] arr = {10, 9, 8, 7};
                arr = Sort(arr);
                ==>{ 7, 8, 9, 10};
         */

        System.out.println(sortAsc(new int[]{5, 4, 3, 2, 1}));    //=======>  [1, 2, 3, 4, 5]
        System.out.println(sortAsc(new int[]{1, 2, 8, 7, 3}));    //=======>  [1, 2, 3, 7, 8]
        System.out.println(sortAsc(new int[]{1, 2, 0, 1, 2}));    //=======>  [0, 1, 1, 2, 2]
    }

    public static String sortAsc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
