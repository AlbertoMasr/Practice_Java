package Intermediate.Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Coco");
        names.add("Alberto");
        names.add("Sotelo");
        names.add("Olivas");

        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        names.remove(3);
        System.out.println(names);

        names.remove("Alberto");
        System.out.println(names);

        names.add("Coco");
        System.out.println(names);
    }
}
