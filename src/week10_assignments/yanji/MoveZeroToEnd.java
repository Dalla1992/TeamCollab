package week10_assignments.yanji;

import java.util.Arrays;

public class MoveZeroToEnd {

    //Array - Move Zeros to the End
    //Write a method that can move all the zeros to last indexes of the array (Do
    //Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]

    public static void main(String[] args) {
        int[] arr1 = {1,0,2,0,3,0,4,0};

        System.out.println(Arrays.toString(moveZeroToEnd(arr1)));
    }

    public static int[] moveZeroToEnd(int[] arr1){
        int[] arr2 = new int[arr1.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != 0) {
                arr2[index] = arr1[i];
                index++;
            }
        }
        return arr2;
    }

}
