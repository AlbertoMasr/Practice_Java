package Intermediate.Generics;

public class GenericMethodExample {
    public static <T> void printArray(T[] arr) {
        for(T element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};
        Float[] floatArray = {1.1f, 2.2f, 3.3f};
        Character[] charArray = {'a', 'b', 'c'};

        System.out.println("Printing Integer Array:");
        printArray(intArray);

        System.out.println("Printing String Array:");
        printArray(stringArray);

        System.out.println("Printing Float Array:");
        printArray(floatArray);

        System.out.println("Printing Character Array:");
        printArray(charArray);
    }
}
