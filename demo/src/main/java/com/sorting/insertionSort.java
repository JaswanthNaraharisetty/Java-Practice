package com.sorting;

public class insertionSort {

    public static void main(String[] args) {

        int[] inputArray = new int[]{-3, 0, 2, -5, 8, 1};

        int index;

        for (int i = 1; i < inputArray.length; i++) {
            int currentvalue = inputArray[i];
            index = i - 1;

            while (index != 0) {
                if (inputArray[index] > currentvalue) {

                }

                index--;
            }
        }


    }

}
