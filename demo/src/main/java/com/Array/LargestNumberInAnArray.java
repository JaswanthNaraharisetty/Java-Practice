package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumberInAnArray {

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(-3, 0, 2, -5, 8, 1, 53, 15, 71, 94, 11, 38, 66, 92, 18, 78, 25));
        largestNumber(inputList);
        largestNumber1(inputList);
    }

    private static void largestNumber1(List<Integer> inputList) {
        Integer largestNumber = null;
        inputList.stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);

    }

    private static void largestNumber(List<Integer> inputList) {

        Integer largestNumber = null;

        for (Integer i : inputList) {
            if (largestNumber == null || largestNumber < i) {
                largestNumber = i;
            }
        }
        System.out.println(largestNumber);

    }


}
