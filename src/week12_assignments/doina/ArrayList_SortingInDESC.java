package src.week12_assignments.doina;

import java.util.ArrayList;

public class ArrayList_SortingInDESC {

    /**
     * ArrayList - sorting in descending order
     * Write a method that can sort the ArrayList in descending order without
     * using the sort method.
     */

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Original ArrayList: " + numbers);

        // Sort in descending order
        sortDescending(numbers);

        System.out.println("ArrayList after descending sort: " + numbers);
    }

    public static void sortDescending(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    // Swap elements if they are in the wrong order
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
