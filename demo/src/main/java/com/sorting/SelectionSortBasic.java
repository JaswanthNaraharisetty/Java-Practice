package com.sorting;

import java.util.Arrays;

public class SelectionSortBasic {

    public static void main(String[] args) {

        int[] inputArray = new int[]{-3, 0, 2, -5, 8, 1};


        for (int i = 0; i < inputArray.length; i++) {
            int smallNumber = inputArray[i];
            int smallNumberIndex = i;
            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[j] < smallNumber) {

                    smallNumber = inputArray[j];
                    smallNumberIndex = j;

                }


            }

            if (smallNumberIndex > i) {
                int temp = 0;
                temp = inputArray[i];
                inputArray[i] = inputArray[smallNumberIndex];
                inputArray[smallNumberIndex] = temp;
            }


        }
        Arrays.stream(inputArray).forEach(System.out::println);

    }
}
