package collection_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapDemo {
    public static void main(String[] args) {
        List<Map<Integer, String>> list = new ArrayList<>();

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "String1");
        map1.put(2, "String2");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3, "String3");
        map2.put(4, "String4");

        list.add(map1);
        list.add(map2);

        list.forEach(s -> {
            s.forEach((k, v) -> {
                System.out.println(k + " " + v);
            });
        });


    }
}
