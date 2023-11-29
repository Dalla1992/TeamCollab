package week11_assignments.yaroslav;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RemoveValues {
    public static void main(String[] args) {

        /*
                Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
         */
        List<Integer> numsList = new ArrayList<>();
        for (int i = 1; i < 150; i++) {
            numsList.add(i);
        }
        System.out.println("Before removal: " + numsList);
        removeValues(numsList);
        System.out.println("After removal: " + numsList);
    }

    public static void removeValues(List<Integer> numbersList) {
        numbersList.removeIf(p -> p > 100);
    }
}
