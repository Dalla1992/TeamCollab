package week8_assignments.yanji;

public class PasswordValidation {

    //String -- Password Validation Task
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns false

    public static void main(String[] args) {
        System.out.println(passwordValidation("Abc128")); // false
        System.out.println(passwordValidation("abc128")); //false
        System.out.println(passwordValidation("Abc128!"));//true
        System.out.println(passwordValidation("Abc!!!!"));//false
        System.out.println(passwordValidation("1applE$"));
    }


    public static boolean passwordValidation(String password){
        boolean valid = true;

        boolean uppercase = false,
                lowercase = false,
                special = false,
                digit = false;

      if(password.length()>=6)  {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))){
                    uppercase = true;
                }else if(Character.isLowerCase(password.charAt(i))){
                    lowercase = true;
                }else if(Character.isDigit(password.charAt(i))){
                    digit = true;
                }else if(password.substring(i,i+1).isBlank()){
                    valid = false;
                }else if(!(Character.isLetterOrDigit(password.charAt(i)))){
                    special = true;
                }
            }
            if(!uppercase||!lowercase||!special||!digit){
                valid = false;
            }
        }else{
          valid = false;
      }
      return valid;
    }
}
