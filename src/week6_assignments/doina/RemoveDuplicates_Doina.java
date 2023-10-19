package src.week6_assignments.doina;

public class RemoveDuplicates_Doina {

    public static String removeDup(String str) {

        // Initialize an empty string to store the result without duplicates
        String result = "";

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {

            // // Check if the current character is not already in the result string
            if (!result.contains("" + str.charAt(i))) {

                // If the character is not in the result, add it to the result string
                result += "" + str.charAt(i);
            }
        }

        // Return the modified string with duplicates removed
        return result;
    }
}
