package com.sorting;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {

        int[] inputArray = new int[]{-3, 0, 2, -5, 8, 1};

        int index;
        int temp;

        for (int i = 1; i < inputArray.length; i++) {

            for (int j = i; j > 0; j--) {

                if (inputArray[j] < inputArray[j - 1]) {
                    temp = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = temp;

                }
            }

        }
        Arrays.stream(inputArray).forEach(System.out::println);
    }


}


