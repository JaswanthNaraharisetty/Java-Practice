package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(-3, 0, 2, -5, 8));

        List<Integer> finalOutput = quickSOrt(inputList, 0);
        

    }

    private static List<Integer> quickSOrt(List<Integer> inputList, int pivotIndex) {

        int pivot = inputList.getLast();


        for (int i = 0; i < inputList.size(); i++) {
            // System.out.println(inputList.get(i));

        }
        return inputList;
    }


}
