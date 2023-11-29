package week11_assignments.yaroslav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAhmed {
    public static void main(String[] args) {

        /*
                Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
                Write a java operation to remove all the names named Ahmed
         */

        //List<String> list = Arrays.asList("Ahmed", "John", "Eric", "Ahmed");
        //list.removeIf(p -> p.equals("Ahmed"));   --> throws UnsupportedOperationException
        //list.add("Bill"); --> throws UnsupportedOperationException
        //System.out.println(list);

        System.out.println(removeName_usingStream(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"), "Ahmed")); //[John, Eric]
        System.out.println(removeName_usingStream(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"), "")); //[Ahmed, John, Eric, Ahmed]
        System.out.println("*  *  *  *  *");
        System.out.println(removeName_usingList(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"), "Ahmed")); //[John, Eric]
    }
    public static List<String> removeName_usingStream(List<String> namesList, String nameToRemove) {
        return namesList.stream().filter(p -> !p.equals(nameToRemove)).collect(Collectors.toList());
    }

    public static List<String> removeName_usingList(List<String> namesList, String nameToRemove) {
        //Arrays.asList() produces a list from which it is impossible to remove or add elements, because it has a fixed length
        // so using explicit new ArrayList and passing the values to be able to modify it
        List<String> dataList = new ArrayList<>(namesList);
        dataList.removeIf(p -> p.equals(nameToRemove));
        return dataList;
    }
}
