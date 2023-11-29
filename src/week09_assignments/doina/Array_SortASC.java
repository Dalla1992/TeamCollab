package src.week9_assignments.doina;

import java.util.Arrays;

public class Array_SortASC {

    /*
   Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
    */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortAsc(10, 9, 8, 7)));
        //the final argument may be passed as an array or as a sequence of arguments

        // System.out.println(Arrays.toString(sortAsc(3,7,6,3,9,8,9,-1,8,-5)));
    }
    public static int[] sortAsc(int... arr) { // accept a variable number of arguments (zero or more), as varargs (variable-length argument list)

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) { // then I need to swap the positions

                    int temp = arr[j]; // using a temp var to make sure not to lose that value
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; // swapping
                }

                // System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }
}
