package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfSquaresOfEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sum);
    }

}



