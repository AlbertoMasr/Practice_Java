package Advanced.Functional_Programming;

import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = List.of("Coco", "Alberto", "Sotelo", "Olivas");
        List<Integer> ages = List.of(20, 21, 20, 23);

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        float count = ages.stream().count();
        System.out.println(count);

        int distinct = (int) ages.stream().distinct().count();
        System.out.println(distinct);
    }
}
