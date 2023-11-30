package src.week11_assignments.doina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Remove_Ahmed {

      /*
    Given a list of people's names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */

    public static List<String> removeAhmed(List<String> names){
        Iterator<String> iterator = names.iterator(); // the way to move through the elements one at a time, like a pin

        while (iterator.hasNext()){ // hasNext() -> checks if we have another element
            if(iterator.next().equals("Ahmed")){ // next() -> moves the pin & reads the value
                iterator.remove();
            }
        }
        return names;
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","Alexander","Maria","Ahmed","Brooke"));
        System.out.println(removeAhmed(names));
    }

}
