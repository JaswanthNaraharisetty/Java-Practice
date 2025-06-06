package com.basicMaths;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int inputNumber = 153;
        int temp = 0;
        int orginalNumber = inputNumber;

        int totalNumber = String.valueOf(inputNumber).length();


        while (inputNumber != 0) {

            temp = (int) (temp + Math.pow(inputNumber % 10, totalNumber));
            // System.out.println(inputNumber % 10);
            inputNumber = inputNumber / 10;
        }

        System.out.println(temp);

        if (temp == orginalNumber)
            System.out.println("Amstrong");
        else
            System.out.println("Not Amstrong");
    }

}
