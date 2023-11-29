package week01_assignments.abdalla;

public class divisionWithoutOperator {

    public static void main(String[] args) {
        divide(6,2);
    }

    public static void divide(int n1, int n2) {
        if (n2 == 0 ){
            throw new ArithmeticException("You can't divide by 0");
        }

        int count = 0;
        String result = n1 + " / " + n2 + " is ";

        while (n1 >= n2){

            n1 -= n2;
            count++;
        }

        System.out.println(result + count + " with remainder of " + n1);


    }
}
