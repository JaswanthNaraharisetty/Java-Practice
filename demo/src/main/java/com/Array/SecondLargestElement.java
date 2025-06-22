package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(-3, 0, 2, -5, 8, 1, 53, 15, 71, 94, 11, 38, 66, 92, 18, 78, 25));

        findsecondLargestElement(inputList);


    }

    private static void findsecondLargestElement(List<Integer> inputList) {

        Integer firstLargest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;
        

        for (Integer i : inputList) {

            if (firstLargest < i) {
                firstLargest = i;
            }

            if (secondLargest < i && firstLargest != i) {
                secondLargest = i;
            }

        }

        System.out.println(secondLargest);


    }

}
