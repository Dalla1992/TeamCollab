package src.week7_assignments.doina;

public class UniqueCharacters {

    public static void main(String[] args) {
        System.out.println(isUnique("AAABBBCCCDEF"));
    }

    public static String isUnique(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)  ){
                unique += each;
            }

        }
        return unique; //DEF
    }
}
