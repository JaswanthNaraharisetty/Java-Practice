package com.Recursion;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        inputArray = reverseArray(inputArray, 0, inputArray.length - 1);
        Arrays.stream(inputArray).forEach(System.out::println);


    }

    public static int[] reverseArray(int[] inputArray, int start, int end) {

        int temp = 0;

        if (start < end) {
            temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            inputArray = reverseArray(inputArray, start + 1, end - 1);

        }
        return inputArray;
    }

}
