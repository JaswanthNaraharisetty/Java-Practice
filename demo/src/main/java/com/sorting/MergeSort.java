package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

        List<Integer> inputList = new ArrayList<>(Arrays.asList(-3, 0, 2, -5, 8, 1, 53, 15, 71, 94, 11, 38, 66, 92, 18, 78, 25));


        //Divide list
        List<Integer> finalOutput = MergeSortDivide(inputList);
        System.out.println(finalOutput);


    }

    private static List<Integer> MergeSortDivide(List<Integer> inputList) {
        // System.out.println(inputList);
        int left = 0;
        int right = inputList.size();
        if (left < right && inputList.size() > 1) {
            int mid = (left + right) / 2;

            List<Integer> leftList = MergeSortDivide(inputList.subList(0, mid));
            List<Integer> rightList = MergeSortDivide(inputList.subList(mid, inputList.size()));

            return MergeSortCombine(leftList, rightList);

        }
        return inputList;
    }

    private static List<Integer> MergeSortCombine(List<Integer> leftList, List<Integer> rightList) {

        List<Integer> merged = new ArrayList<>();


        int leftindex = 0;
        int rightindex = 0;

        while (rightindex < rightList.size() && leftindex < leftList.size()) {


            if (leftList.get(leftindex) < rightList.get(rightindex)) {
                merged.add(leftList.get(leftindex));
                leftindex++;
            } else {
                merged.add(rightList.get(rightindex));
                rightindex++;
            }

        }

        merged.addAll(rightList.subList(rightindex, rightList.size()));

        merged.addAll(leftList.subList(leftindex, leftList.size()));


        return merged;
    }

}
