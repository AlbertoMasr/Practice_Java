package Advanced.Functional_Programming;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));

        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        greet.accept("Coco");
        greet.accept("Chihua");

        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get());
        System.out.println("Random number: " + randomNumber.get());

        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("Length of 'Hello': " + lengthFunction.apply("Hello"));
        System.out.println("Length of 'World!': " + lengthFunction.apply("World!"));
    }
}
