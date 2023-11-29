package src.week5_assignments.doina;

public class ReverseInteger_Doina {

    public static void main(String[] args) {


        System.out.println(reverseInt(-1234));
        System.out.println(reverseInt(-872387643));
    }

    public static int reverseInt(int n){ // 1

        n = -1 * n;

        int rev = 0; // 4321

        while(n > 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return -1 * rev;
    }
}
