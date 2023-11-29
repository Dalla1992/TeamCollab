package src.week3_assignments.doina;

public class SwapTwoStrings_Doina {

    public static void swapStrings(String str1, String str2){

        System.out.println("Strings before swapping: " + str1 + " " + str2);

        //Combines the two strings and store it in str1
        str1 = str1 + str2;

        //Extracts the original value of str2 from updated str1
        str2 = str1.substring(0, (str1.length() - str2.length())); // Good, from (0,4)


        //Extracts the original value of str1 from updated str1
        str1 = str1.substring(str2.length()); // night, from index 4 of updated str1

        System.out.println("Strings after swapping: " + str1 + " " + str2);

    }
}
