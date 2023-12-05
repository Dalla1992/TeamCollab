package week12_assignments.yaroslav;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapValues {
    public static void main(String[] args) {
        /*
                Write a method that can sort the Map by values
         */

        Map<String, String> personDataMap = new HashMap<>();
        personDataMap.put("firstName", "John");
        personDataMap.put("lastName", "Huggins");
        personDataMap.put("department", "Logistics");
        personDataMap.put("position", "Manager");


        System.out.println(sortByValues(personDataMap));
    }

    public static Map<String, String> sortByValues(Map<String, String> input) {
        Map<String, String> resultMap = new LinkedHashMap<>();
        List<String> valuesList = new ArrayList<>(input.values());
        //Collections.sort(valuesList); if it's not allowed than using the custom sort method below
        for (int i = 0; i < valuesList.size(); i++) {
            String temp;
            for (int j = i + 1; j < valuesList.size(); j++) {
                if (valuesList.get(i).compareTo(valuesList.get(j)) > 0) {
                    temp = valuesList.get(i);;
                    valuesList.set(i, valuesList.get(j));
                    valuesList.set(j, temp);
                }
            }
        }
        //extracting each value from the sorted list and finding the Key/Value pair that match the list value to add to the result map
        for (int i = 0; i < valuesList.size(); i++) {
            for (Map.Entry<String, String> entry : input.entrySet()) {
               if (entry.getValue().equals(valuesList.get(i))) {
                   resultMap.put(entry.getKey(), entry.getValue());
               }
            }
        }
        return resultMap;
    }
}
