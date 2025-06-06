package com.basicMaths;

public class PrintAllDivisors {

    public static void main(String[] args) {
        int inputValue = 200;

        for (int i = 2; i < inputValue; i++) {
            if (inputValue % i == 0) {
                System.out.println(i);
            }

        }

    }
}
