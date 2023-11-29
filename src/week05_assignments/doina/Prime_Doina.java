package src.week5_assignments.doina;

public class Prime_Doina {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(8));
        System.out.println(isPrime(11));
        System.out.println(isPrime(13));

        System.out.println(isPrime(1));

    }

    public static boolean isPrime(int n){

        if(n < 2){ // // 0 and 1 are not prime numbers
            return false;
        }

        for(int i = 2; i < n; i++){

            if(n % i == 0){
                return false;
            } // If the number is divisible by any i, it's not prime

        }

        return true;
    } // If no divisors were found, the number is prime
}
