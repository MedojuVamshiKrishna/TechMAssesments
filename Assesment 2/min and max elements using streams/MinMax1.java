package Assesment_2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MinMax1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 15, 3, 20, 7);

        // Finding maximum value
        OptionalInt max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();

        // Finding minimum value
        OptionalInt min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();
                

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

