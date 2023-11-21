package week10_assignments.Darya;

import java.util.Arrays;

public class ZerosToTheEnd {

    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
     */
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0};

        System.out.println("Arrays.toString(zerosToTheEnd(arr)) = " + Arrays.toString(zerosToTheEnd(arr)));
    }

    public static int[] zerosToTheEnd(int[] arr) {

        int[] newArr = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

}
