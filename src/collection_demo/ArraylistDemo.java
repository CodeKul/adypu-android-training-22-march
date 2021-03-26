package collection_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach(s -> {
            System.out.println(s);
        });


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list3 = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> list4 = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};


        List<String> list5 = new ArrayList();
        list5.add("String1");

    }
}
