package Advanced.Functional_Programming;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Coco");
        Optional<String> empty = Optional.empty();

        System.out.println(name.orElse("Alberto"));
        name.ifPresent(value -> System.out.println("Hello, " + value));

        System.out.println(empty.orElse("Alberto"));
        empty.ifPresent(value -> System.out.println("Hello, " + value));
    }
}
