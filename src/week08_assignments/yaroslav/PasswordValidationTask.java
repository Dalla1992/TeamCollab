package week08_assignments.yaroslav;

import java.util.HashMap;
import java.util.Map;

public class PasswordValidationTask {
    public static void main(String[] args) {
        /*
            1. Write a return method that can verify if a password is valid or not.
                requirements:
            1. Password MUST be at least have 6 characters and should not contain space
            2. PassWord should at least contain one upper case letter
            3. PassWord should at least contain one lowercase letter
            4. Password should at least contain one special characters
            5. Password should at least contain a digit
            if all requirements above are met, the method returns true, otherwise returns false
     */

        System.out.println(isPasswordGood("2 3"));          //false
        System.out.println("=====================");
        System.out.println(isPasswordGood("!A2a4553"));    //true
        System.out.println("=====================");
        System.out.println(isPasswordGood("AAAaaa"));

    }
    public static boolean isPasswordGood(String password) {
        String message = "";
        if (password.length() < 5) {
            message = message.concat("Password length is less than 6 characters\n");
        }

        if (password.contains(" ")) {
            message = message.concat("Password contains space\n");
        }

        Map<String, Integer> charsMap = new HashMap<>();
        charsMap.put("lowerCaseChars", 0);
        charsMap.put("upperCaseChars", 0);
        charsMap.put("specialChars", 0);
        charsMap.put("digitChars", 0);

        for (char eachChar : password.toCharArray()) {
            if (Character.isDigit(eachChar)) {
                charsMap.put("digitChars", charsMap.get("digitChars") + 1);
            } else if (!Character.isLetterOrDigit(eachChar) && !Character.isSpaceChar(eachChar)) {
                charsMap.put("specialChars", charsMap.get("specialChars") + 1);
            } else if (Character.isUpperCase(eachChar)) {
                charsMap.put("upperCaseChars", charsMap.get("upperCaseChars") + 1);
            } else if (Character.isLowerCase(eachChar)) {
                charsMap.put("lowerCaseChars", charsMap.get("lowerCaseChars") + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : charsMap.entrySet()) {
            if (entry.getValue() == 0) {
                message = message.concat("Password doesn't contain any " + entry.getKey() + "\n");
            }
        }

        if (!message.isEmpty()) {
            System.out.println(password);
            System.out.println(message);
            return false;
        }

        System.out.println(password);
        return true;
    }





}
