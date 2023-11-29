package week10_assignments.yaroslav;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SumOfZero {
    public static void main(String[] args) {

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

        int randomNumber = new Random().nextInt(98) + 1 ;
        System.out.println(sumZero(randomNumber));   //result is always randomly generated



    }

    public static String sumZero(int number) {
        //creating array and adding possible numbers from -9 to 9
        int[] arr = new int[199];
        int index = 0;
        for (int i = -99; i < 100; i++) {
            arr[index] = i;
            index++;
        }
        // creating empty array that will hold future values that meet the requirement with a length of the number that is passed to the method
        int[] sumArr = new int[number];
        int target = 1;

        while (target != 0) {
            //this part fills our target array with random numbers from -9 to 9
            for (int i = 0; i < sumArr.length; i++) {
                int randomNumber = arr[new Random().nextInt(arr.length - 1)];
                //checking if our array already contains the random number to avoid having duplicated values
                if (Arrays.stream(sumArr).noneMatch(x -> x == randomNumber)) {
                    sumArr[i] = randomNumber;
                }
            }
            //reassigning the value of the target variable to 0 so that we could identify the new sum, we need our variable to equal to zero
            target = 0;
            //finding the sum of the values inside our target array, if the sum results in 0 the loop will break and our array will hold the values
            //that we need
            for (int i = 0 ; i < sumArr.length; i++) {
                target += sumArr[i];
            }
        }
        return Arrays.toString(sumArr);
    }
}
