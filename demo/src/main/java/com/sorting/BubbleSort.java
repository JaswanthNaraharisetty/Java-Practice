package com.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] inputArray = new int[]{-3, 0, 2, -5, 8, 1};

        boolean sort = true;
        int temp;

        while (sort) {
            sort = false;
            for (int i = 0; i < inputArray.length - 1; i++) {

                if (inputArray[i] > inputArray[i + 1]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                    sort = true;
                }


            }

        }

        Arrays.stream(inputArray).forEach(System.out::println);

    }

}
