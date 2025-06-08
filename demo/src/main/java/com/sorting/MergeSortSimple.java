package com.sorting;

import java.util.Arrays;

public class MergeSortSimple {

    public static void main(String[] args) {
        int[] inputArray = new int[]{-3, 0, 2, -5, 8, 1};

        mergeSort(inputArray, 0, inputArray.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(inputArray));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(array, left, mid);       // Sort left half
            mergeSort(array, mid + 1, right);  // Sort right half

            merge(array, left, mid, right);    // Merge sorted halves
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;       // Start of left half
        int j = mid + 1;    // Start of right half
        int k = 0;          // Index for temp array

        while (i <= mid && j <= right) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = array[i++];
        }

        // Copy remaining elements from right half
        while (j <= right) {
            temp[k++] = array[j++];
        }

        // Copy sorted temp back into original array
        for (int l = 0; l < temp.length; l++) {
            array[left + l] = temp[l];
        }
    }
}
