package com.Recursion;

public class FactorialOfNNumbers {
    public static void main(String[] args) {

        int output = factorial(5);

        System.out.println(output);

    }

    public static int factorial(int inputNumber) {

        if (inputNumber > 0) {
            inputNumber = inputNumber * factorial(inputNumber - 1);

        } else {
            return 1;
        }

        return inputNumber;


    }

}
