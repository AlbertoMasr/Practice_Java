package Intermediate.Collections_Framework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> namesAndAges = new HashMap<>();

        namesAndAges.put("Coco", 4);
        namesAndAges.put("Alberto", 24);

        System.out.println(namesAndAges);

        for(Map.Entry<String, Integer> entry : namesAndAges.entrySet()) {
            System.out.println("Name: "+ entry.getKey() +", Age: "+ entry.getValue());
        }
    }
}
