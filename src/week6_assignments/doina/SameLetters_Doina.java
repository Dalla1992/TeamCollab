package src.week6_assignments.doina;

import java.util.Arrays;

public class SameLetters_Doina {

    public static boolean same(String a, String b) {

        // Convert strings to character arrays
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        // Sort the character arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Initialize two empty strings
        String a1="", a2="";

        // Concatenate sorted characters to form strings
        for(char each: ch1)
            a1 +=each;

        for(char each: ch2)
            a2 +=each;

        // Compare the two strings to check if they are equal
        return a1.equals(a2) ;
    }
}
