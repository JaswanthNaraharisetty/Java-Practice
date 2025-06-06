package com.basicMaths;

public class CountDigitsInANumber {

    public static void main(String[] args) {
        // main();
        Integer inputNumber = 329823;

        int count = 0;

        while (inputNumber != 0) {
            inputNumber = inputNumber / 10;
            count++;
        }

        System.out.println(count);

    }

}
