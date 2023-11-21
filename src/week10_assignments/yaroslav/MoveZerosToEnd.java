package week10_assignments.yaroslav;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {


        /*
        Array - Move Zeros to the End
        Write a method that can move all the zeros to last indexes of the array (Do
        Not Use Sort Method)
        Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,0]
         */
        System.out.println(Arrays.toString(moveZeroes(new int[]{1,0,2,0,3,0,4,0})));    // => [1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println(Arrays.toString(moveZeroes(new int[]{0,0,0,0,1,2,3,4})));    // => [1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println(Arrays.toString(moveZeroes(new int[]{1,0,0,0,0,0,0,2})));    // => [1, 2, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(moveZeroes(new int[]{1,2,3,4,5,6,7,8})));    // => [1, 2, 3, 4, 5, 6, 7, 8]

    }

    public static int[] moveZeroes(int[] arr) {
        int[] target = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                target[index] = arr[i];
                index++;
            }
        }
        return target;
    }
}
