package com.basicMaths;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int inputArray[] = { 6,5, 4, 3, 2, 1};
        reverseArray(inputArray);


    }

    public static void reverseArray(int inputArray[]){

        int start = 0;
        int end = inputArray.length-1;
        int temp =0;
        while(start < end){

            temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;
        }

        Arrays.stream(inputArray).forEach(System.out::println);
        // System.out.println(inputArray);







    }

}
