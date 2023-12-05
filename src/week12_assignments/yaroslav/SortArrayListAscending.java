package week12_assignments.yaroslav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayListAscending {
    public static void main(String[] args) {


        /*
                Write a method that can sort the ArrayList in ascending order without
                using the sort method
         */

        List<String> dataList = new ArrayList<>(Arrays.asList("banana", "tomato", "apple", "carrot", "kiwi"));
        System.out.println(sortAsc(dataList));  //[apple, banana, carrot, kiwi, tomato]

        List<String> dataList2 = new ArrayList<>(Arrays.asList("banana", "tomato", "apple", "tomato", "banana"));
        System.out.println(sortAsc(dataList2));  //[apple, banana, banana, tomato, tomato]

    }

    public static List<String> sortAsc(List<String> dataList) {
        String temp;
        for (int i = 0; i < dataList.size(); i++) {
            for (int j = i + 1; j < dataList.size(); j++) {
                if (dataList.get(i).compareTo(dataList.get(j)) > 0) {
                    temp = dataList.get(i);
                    dataList.set(i, dataList.get(j));
                    dataList.set(j, temp);
                }
            }
        }
        return dataList;
    }
}
