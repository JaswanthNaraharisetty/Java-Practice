package com.Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int inputNumber = 5;
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        while (secondNumber < inputNumber) {
            sum = secondNumber + firstNumber;
            // changing values
            firstNumber = secondNumber;
            secondNumber = sum;
        }
        System.out.println(sum);
    }
    
}
