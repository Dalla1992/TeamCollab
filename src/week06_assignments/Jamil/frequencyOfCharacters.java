package week06_assignments.Jamil;

public class frequencyOfCharacters {

    public static void main(String[] args) {
        charFrequency("AABBCDDA");
    }

    public static void charFrequency(String str) {  //AABBCDDA
        //012345678
        String x = "";
        int c;
        for (int i = 0; i < str.length(); i++) {
            c = 0;

            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    c++;
                }
                if (j == str.length() - 1) {
                    if (!x.contains("" + str.charAt(i))) {
                        x += "" + str.charAt(i) + c;
                    }
                }
            }
        }
        System.out.println(x);
    }

}
