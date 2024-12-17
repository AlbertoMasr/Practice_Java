package Begginer.Basic_Array_Operations;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 10, 20, 4, 12, 5};

        System.out.println("Original array: "+ Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) max = numbers[i];
            if(numbers[i] < min) min = numbers[i];
        }

        System.out.println("Max value: "+ max);
        System.out.println("Min value: "+ min);

        Arrays.sort(numbers);
        System.out.println("Sorted array: "+ Arrays.toString(numbers));

        int elementToSearch = 10;
        int index = Arrays.binarySearch(numbers, elementToSearch);
        System.out.println("Element "+ elementToSearch +" found at index: "+ index);
    }
}
