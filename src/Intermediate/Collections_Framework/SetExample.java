package Intermediate.Collections_Framework;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Coco");
        names.add("Alberto");
        names.add("Sotelo");
        names.add("Olivas");

        System.out.println(names);

        names.remove("Alberto");
        System.out.println(names);

        names.add("Coco");
        System.out.println(names);
    }
}
