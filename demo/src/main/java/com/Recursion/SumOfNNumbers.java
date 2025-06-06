package com.Recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {

        int a =   sumOfNumbers(100);
        System.out.println(a);

    }

    public  static  int sumOfNumbers(int inputNumber){

        if(inputNumber>0)
            inputNumber = inputNumber + sumOfNumbers(inputNumber-1);
         else
            return 0;

        return inputNumber;
    }
}
