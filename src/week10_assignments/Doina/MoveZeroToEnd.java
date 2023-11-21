package src.week10_assignments.Doina;

import java.util.Arrays;

public class MoveZeroToEnd {
     /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
     */

    public static int[] moveZeros(int... nums){

        int[] moved = new int[nums.length];
        int index = 0; // so the index is not updated for each iteration, that's why it works

        for (int each : nums) {

            if (each != 0){
                moved[index++] = each; // if the number is not 0, add it to moved[]
            }
        }
        return moved;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveZeros(1, 0, 2, 0, 3, 0, 4, 0)));
    }
}
