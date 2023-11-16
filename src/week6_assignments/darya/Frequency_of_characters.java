package week6_assignments.darya;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_characters {

    public static void main(String[] args) {
        charFrequency("AABBCDDA");
    }

    public static void charFrequency(String str) {  //AABBCDDA
                                                    //012345678
        String x = "";
        int c;
        for (int i = 0; i < str.length(); i++) {
            c = 0;

            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    c++;
                }
                if (j == str.length() - 1) {
                    if (!x.contains("" + str.charAt(i))) {
                        x += "" + str.charAt(i) + c;
                    }
                }
            }
        }
        System.out.println(x);
    }

}

  /*  //String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String frequencyOfChar (String str){

        Map<Character, Integer> frequencyMap = new HashMap<>();
        char [] characters = str.toCharArray();

        for (char each : characters){
            if (frequencyMap.containsKey(each)){

            }
        return str;

    }

}

   */
