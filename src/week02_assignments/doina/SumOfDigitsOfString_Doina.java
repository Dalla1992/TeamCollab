package src.week2_assignments.doina;

public class SumOfDigitsOfString_Doina {

    public static String sumOfString(String str){

        String digits = "";
        int sum = 0;

//        for(char each : str.toCharArray()){ // converting in array of characters
//
//            if(Character.isDigit(each)){ // checking if each character is digit
//
//                sum += Integer.parseInt("" + each);// converting character in digit(number)
//            }
//        }

        for (int i = 0; i < str.length(); i++) { // i=0, iteration, index

            if(Character.isDigit(str.charAt(i))){ // str.charAt(i) each char of the String --> I

                sum += Integer.parseInt(String.valueOf(str.charAt(i)));

                // 5 + 3 + ...
                digits += str.charAt(i) + "+";
            }
        }
        return digits.substring(0, digits.length()- 3) + " = " + sum;
    }
}
