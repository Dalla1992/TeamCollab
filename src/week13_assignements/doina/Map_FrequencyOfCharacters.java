package src.week13_assignements.doina;

import java.util.HashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    /**
     * Map-- Frequency of Characters
     * Write a method that prints the frequency of each character from a String.
     */
    public static void main(String[] args) {
        frequencyOfCharacter("banana apple pie");
    }
    public static void  frequencyOfCharacter(String str){

        Map<Character, Integer> counter = new HashMap<>(); // key - each char and the value - is the frequency, Note: LinkedHashmap keeps the order

        for(int i = 0; i < str.length();i++){

            char eachChar = str.charAt(i);

            if(!counter.containsKey(eachChar)){

                counter.put(eachChar, 0);
            }

            counter.put(eachChar, counter.get(eachChar) + 1);
        }
        System.out.println(counter);
    }
}
