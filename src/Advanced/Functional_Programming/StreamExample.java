package Advanced.Functional_Programming;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sumEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> number * number)
                .sum();

        System.out.println("Sum of the squares of even numbers: " + sumEven);

        int sumOdd = numbers.stream()
                .filter(number -> number % 2 != 0)
                .mapToInt(number -> number * number)
                .sum();

        System.out.println("Sum of the squares of odd numbers: " + sumOdd);
    }
}
