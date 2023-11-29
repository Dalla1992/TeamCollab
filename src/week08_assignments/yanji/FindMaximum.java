package week08_assignments.yanji;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaximum {

    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        int[] arr = {8,-5,-99,5,6,11,2,4,9,-1000};
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int value: arr){
            list.add(value);
        }
        return Collections.max(list);
    }
}
