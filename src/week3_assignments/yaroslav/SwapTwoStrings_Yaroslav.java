package week3_assignments.yaroslav;

public class SwapTwoStrings_Yaroslav {
    public static void main(String[] args) {

        //TODO create a void method that will accept 2 String params. Swap variable values without creating third variable.

        swap("apple", "jam");
        swap("", "jam");
        swap("", "");
        swap(null, "apple");
        swap("car", null);

    }
    public static void swap(String a, String b) {
        String before = "Before: a = " + a + ", b = " + b;

        if (a == null || b == null) {
            if (a == null) {
                a = b;
                b = null;
            } else {
                b = a;
                a = null;
            }
            String after = "After: a = " + a + ", b = " + b;
            System.out.println(before + "\n" + after);
            System.out.println("-----------------------");
            return;
        }

        if (!a.isEmpty() || !b.isEmpty()) {
            //option #1
              a = a + b;
              b = a.substring(0, a.indexOf(b));
              a = a.substring(a.indexOf(b) + b.length());
            //option #2
              //a = a + " " + b;
              //b = a.split(" ")[0];
              //a = a.split(" ")[1];
        }

        String after = "After: a = " + a + ", b = " + b;
        System.out.println(before + "\n" + after);
        System.out.println("-----------------------");
    }
}
