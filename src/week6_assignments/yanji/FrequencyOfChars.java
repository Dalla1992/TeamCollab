package week6_assignments.yanji;

public class FrequencyOfChars {

    //String -- Frequency of Characters
    //Write a return method that can find the frequency of
    //characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


    public static String countFrequencyOfEach(String str) {

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            if(result.contains(""+ch)){
                continue;
            }
            result += ""+ch+count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countFrequencyOfEach("AAABBCDD"));
        System.out.println(countFrequencyOfEach("AABC"));
        System.out.println(countFrequencyOfEach("PINEAPPLE"));
    }
}