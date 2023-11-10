package util.week06;

import java.util.Collections;

public class PasswordValidation {

    public static void main(String[] args) {

        /*
        String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:

1. Password MUST be at least have 6 characters and should not contain space

2. PassWord should at least contain one upper case letter

3. PassWord should at least contain one lowercase letter

4. Password should at least contain one special characters

5. Password should at least contain a digit
         */

        System.out.println(password_Verification("R1!an"));

    }

    public static String password_Verification(String password) {

        int UpperCase = 0;
        int LowerCase = 0;
        int isDigit = 0;
        int specialInt = 0;
        //------------------------------------------------------------------------------------

        if (password.length() < 6 && password.contains(password.trim())) {
        } else {
            throw new RuntimeException("Your Passwords is: (" + password + "),\nPassword MUST be at least have 6 characters and should not contain space\n");
        }

        //------------------------------------------------------------------------------------

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                UpperCase++;
            }

            if (Character.isLowerCase(c)) {
                LowerCase++;
            }
        }

        if (UpperCase > 0 && LowerCase > 0) {
        } else {
            throw new RuntimeException("\n\n" + password + ": Password should at least contain one upper case letter\nor PassWord should at least contain one lowercase letter\n\n");
        }
//------------------------------------------------------------------------------------
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                isDigit++;
            }
        }

        if (isDigit > 0) {
        } else {
            throw new RuntimeException("\n\n" + password + ": Password should at least contain a digit\n\n");
        }
        //------------------------------------------------------------------------------------

        for (char c : password.toCharArray()) {
            if (!Character.isDigit(c) && !Character.isUpperCase(c) && !Character.isLowerCase(c)) {
                specialInt++;
            }
        }

        if (specialInt > 0) {
        } else {
            throw new RuntimeException("\n\n" + password + ": Password should at least contain one special characters\n\n");
        }
        return password;
    }
}
