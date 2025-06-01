package com.example;

public class ArrayLearning {

public static void main(String[] args) {

    int [] numberList = new int[5];
    numberList[0] = 1;
    numberList[1] = 2;
    numberList[2] = 3;
    numberList[3] = 4;
    numberList[4] = 5;

    changeElementInArray(numberList,4,20);
    displayArray(numberList);
    sumOfArray(numberList);



}

    public static void displayArray(int[] numberListValue) {
        System.out.println("Number in array are");
        for (int i: numberListValue) {
            System.out.println(i);
        }
    }

    public static void sumOfArray(int[] numberListValue) {
        int sum = 0;
        for (int i: numberListValue) {
            sum = sum + i;
        }

        System.out.println("Sum is " + sum);
    }

    public static void changeElementInArray(int[] numberListValue, int position,int value) {

        if(position < numberListValue.length) {
            numberListValue[position] = value;
        }

    }

}

