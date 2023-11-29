package week01_assignments.abdalla;

public class taskFINRA {
    public static void main(String[] args) {



        for (int i = 1; i <= 30; i++) {
            String str = "";

            if (i % 3 == 0){
                str += "FIN";
            }

            if (i % 5 == 0){
                str += "RA";
            }

            if (str.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(str);
            }
        }
    }
}
