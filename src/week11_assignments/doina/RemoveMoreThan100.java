package src.week11_assignments.doina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveMoreThan100 {
     /*
     ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static List<Integer> removeMoreThan100(List<Integer> nums){

        Iterator<Integer> iterator = nums.iterator();

        while(iterator.hasNext()){
            if(iterator.next() > 100){
                iterator.remove();
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,4,200,3,5,350,21,-9,33,456));
        System.out.println(removeMoreThan100(nums));
    }
}
