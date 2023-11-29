package src.week6_assignments.doina;

public class FrequencyOfChars_Doina {

    public static String countFrequencyOfEach(String str) {
        String result = ""; // Initialize an empty string to store the result

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            String eachChar = "" + str.charAt(i); // Convert the character at index i to a string

            // Check if the character has not been encountered before in the result string
            if (!result.contains(eachChar)) {
                int count = 0; // Initialize a counter to store the frequency of the character

                // Iterate through the remaining characters to count the occurrences of the current character
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) { // Compare characters at index i and j
                        count++; // Increment the counter if the characters are the same
                    }
                }

                // Append the character and its count to the result string
                result += eachChar + count;
            }
        }

        // Return the string that represents the count of each character
        return result;
    }
}
