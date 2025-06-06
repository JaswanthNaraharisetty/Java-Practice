package com.basicMaths;

public class ReverseANumber {

    public static void main(String[] args) {

        int inputNumber = 1234456;
        int reverseNumber = 0;

        while (inputNumber != 0) {
            reverseNumber = (reverseNumber * 10) + inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        System.out.println(reverseNumber);

    }

}
