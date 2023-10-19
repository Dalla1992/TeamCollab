package util.week4;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        frequency("AAABBCDD");




    }

    public static void frequency(String str){
        String characters = "";
        int count;

        for (int i = 0; i < str.length();i++){
            count=0;

            for (int j = 0; j < str.length();j++){
              if (str.charAt(j) == str.charAt(i)){
                  count++;
              }
              if (j == str.length()-1){
                  if (!characters.contains("" + str.charAt(i))){
                      characters += "" + str.charAt(i) + count;
                  }
              }
            }
        }
        System.out.println(characters);

    }



}

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
