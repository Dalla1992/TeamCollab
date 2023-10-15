package week6_assignments.yaroslav;

public class CharFrequency {
    public static void main(String[] args) {

        //TODO Write a method that can find the frequency of characters
        // Example: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        System.out.println(charFrequency("apple"));          // a1p2l1e1
        System.out.println(charFrequency("abdalla"));        // a3b1d1l2
        System.out.println(charFrequency(""));               //
        System.out.println(charFrequency(null));             // Please provide a valid text

    }

    public static String charFrequency(String text) {
        if (text == null) {
            return "Please provide a valid text";
        }
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int counter = 0;
            if (result.contains(text.charAt(i) + "")) {
                continue;
            }
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    counter++;
                }
            }
            result = result + text.charAt(i) + counter;
        }

        return result;
    }
}
