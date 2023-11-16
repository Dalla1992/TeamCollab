package src.week8_assignments.doina;

public class String_PasswordValidation {

    public static boolean isValidPassword(String password) {
        // Check for length and space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Initialize flags for each rule
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Iterate over each character in the password
        for (char ch : password.toCharArray()) {
            // Check for uppercase characters
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            // Check for lowercase characters
            else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
            // Check for digits
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            // Check for special characters
            else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        // Check if all conditions are met
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {

        // Test the method with some example passwords
        System.out.println(isValidPassword("Abcdef1@")); // Should return true
        System.out.println(isValidPassword("invalid")); // Should return false
    }
}
