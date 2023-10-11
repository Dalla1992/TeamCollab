package util.Week03Assignments;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println("ReverseNegativeNumber(-100) = " + ReverseNegativeNumber(-100));

    }

    public static int ReverseNegativeNumber(int num) {
        int positiveNumbers = 0;

        if (num < 0) {
            positiveNumbers = num * (-1);
            //                -100 * (-1) = 100 bc 2 negative operators == positive
        }
        return positiveNumbers;
    }

}

//2. Numbers -- Reverse negative number
//Write a return method that can reverse negative number and return it as int