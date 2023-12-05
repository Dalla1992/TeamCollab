package week12_assignments.yaroslav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayListDescending {
    public static void main(String[] args) {

        /*
                Write a method that can sort the ArrayList in descending order without
                using the sort method
         */

        List<String> dataList = new ArrayList<>(Arrays.asList("banana", "tomato", "apple", "carrot", "kiwi"));
        System.out.println(sortDesc(dataList));  //[tomato, kiwi, carrot, banana, apple]

        List<String> dataList2 = new ArrayList<>(Arrays.asList("banana", "tomato", "apple", "tomato", "banana"));
        System.out.println(sortDesc(dataList2));  //[tomato, tomato, banana, banana, apple]

        List<String> dataList3 = new ArrayList<>(Arrays.asList("banana"));
        System.out.println(sortDesc(dataList3));  //[tomato, tomato, banana, banana, apple]
    }

    public static List<String> sortDesc(List<String> dataList) {
        String temp;
        for (int i = 0; i < dataList.size(); i++) {
            for (int j = i + 1; j < dataList.size(); j++) {
                temp = dataList.get(i);
                if (temp.compareTo(dataList.get(j)) < 0) {
                    dataList.set(i, dataList.get(j));
                    dataList.set(j, temp);
                }
            }
        }
        return dataList;
    }
}
