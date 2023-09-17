public class MethodReverseInteger {
    public static int reverseInt(int n){ // 1

        int rev = 0; // 4321

        while(n > 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev;
    }

}
