package src.week10_assignments.Doina;

import java.util.Arrays;

public class SumUpToZero {

     /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
     */

    public static int[] sumUpToZero(int n){//4

        int[] nums = new int[n];

        int index = 0;
        int startPoint = -(n/2);
        int endPoint = -startPoint;

            for (int i = startPoint; i <= endPoint; i++) {
                if (i % 2 == 0) {
                    if (i == 0) {
                        continue;
                    } else {
                        nums[index] = i;
                        index++;
                    }

                } else {
                    nums[index] = i;
                    index++;
                }
            }
        return nums;
    }

    public static void main(String[] args) {


        System.out.println(Arrays.toString(sumUpToZero(7)));
    }
}
