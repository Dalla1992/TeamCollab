package week9_assignments.yaroslav;

import java.util.Arrays;

public class SortArrayDescending {
    public static void main(String[] args) {

        /*

                ite a return method that can sort an int array in descending order without using the sort method of the Arrays class
                Ex: int[] arr = {10,20,7, 8, 90};
                arr = Sort(arr); ==> {90, 20, 10, 8, 7};

         */

        System.out.println(sortDesc(new int[]{1, 2, 3, 4, 5}));  //=====> [5, 4, 3, 2, 1]
        System.out.println(sortDesc(new int[]{4, 1, 5, 2, 8}));  //======> [8, 5, 4, 2, 1]
        System.out.println(sortDesc(new int[]{0, 1, 0, 0, 1}));  //======> [1, 1, 0, 0, 0]


    }

    public static String sortDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] < arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        return Arrays.toString(arr);
    }
}
