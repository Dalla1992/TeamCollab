package week11_assignments.yanji;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSome {

    //3) ArrayList - Remove some values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,100,101,200,3,9000,12));

        System.out.println(nums);

        nums.removeIf(p->p>100);

        System.out.println(nums);
    }
}
