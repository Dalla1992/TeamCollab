public class MethodReverseInteger {

    /*
       Reverse Integer

       Create a method to reverse the given number
           parameter: int
           return: int

       Reverse using only numbers, no Strings

       Assume the given number is a positive integer

       Ex:
           input: 1234
           output: 4321
    */
    public static int reverseInt(int n){ // 1

        int rev = 0; // 4321

        while(n > 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseInt(1234));
        System.out.println(reverseInt(872387643));
    }
}
