package util.weeek05;

public class FindTheUnique {

    public static void main(String[] args) {

        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));
        //                                                             1234567891011
    }

    public static String unique(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                unique += str.charAt(i);
            }

        }


        return unique;

    }
}




/*
String -- Find the unique
Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */
