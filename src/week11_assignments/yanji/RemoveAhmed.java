package week11_assignments.yanji;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {

    //2) ArrayList - Remove "Ahmed"
    //Given a list of people's names: "Ahmed", "John", Eric", "Ahmed".....
    //Write a java operation to remove all the names named Ahmed

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

       System.out.println(names);

       names.removeIf(p->p.equalsIgnoreCase("ahmed"));

       System.out.println(names);


    }

}
