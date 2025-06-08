package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortCollections {

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(-3, 0, 2, -5, 8, 1));

        List<Integer> sortedList = mergeSort(inputList);

        System.out.println("Sorted list: " + sortedList);
    }

    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;

        List<Integer> left = mergeSort(list.subList(0, mid));
        List<Integer> right = mergeSort(list.subList(mid, list.size()));
        

        return merge(left, right);
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();

        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }

        // Add remaining elements
        while (i < left.size()) {
            merged.add(left.get(i++));
        }
        while (j < right.size()) {
            merged.add(right.get(j++));
        }

        return merged;
    }
}