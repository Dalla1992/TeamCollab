package week05_assignments.darya;

public class ReverseNegativeNumber {

//Numbers -- Reverse negative number
//Write a return method that can reverse negative number and return it as int

    public static int reverseNegativeNumber(int number){

        if (number < 0){

            String numberString = String.valueOf(number); //-3567
            String positiveNumber = numberString.substring(1); //3567
            String reversedString = new StringBuffer(positiveNumber).reverse().toString();//7653
            String reversedNegativeString = ("-" + reversedString);
            System.out.println("reversedNegativeString = " + reversedNegativeString);
            return Integer.parseInt(reversedNegativeString);

        }else{
            System.err.println("Please provide a NEGATIVE number");
            return number;
        }

    }

    public static void main(String[] args) {

        int num = -345;
        int revNum = reverseNegativeNumber(num);

        System.out.println("num = " + num);
        System.out.println("revNum = " + revNum);
    }

}
