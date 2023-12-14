package src.week13_assignements.doina;

import java.util.HashMap;
import java.util.Map;

public class Map_MinValue {
    /**
     * Map - Min value
     * Write a method that can return the minimum value from a map (DO NOT
     * use sort method).
     */

    public static void main(String[] args) {

        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("A", 5);
        sampleMap.put("B", 2);
        sampleMap.put("C", 8);
        sampleMap.put("D", 1);

        System.out.println("Original Map: " + sampleMap);

        // Find the minimum value in the map
        int minValue = findMinValue(sampleMap);

        System.out.println("Minimum Value in Map: " + minValue);
    }

    public static int findMinValue(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map is null or empty");
        }

        // Initialize min with the first value in the map
        int minValue = map.values().iterator().next();

        // Iterate through the values to find the minimum
        for (int value : map.values()) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }
}
