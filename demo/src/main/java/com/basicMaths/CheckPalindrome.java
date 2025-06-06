package com.basicMaths;

public class CheckPalindrome {

    public static void main(String[] args) {

        // main();
        int inputNumber = 123321;
        int originalNumber = inputNumber;
        int reverseNumber = 0;

        while (inputNumber != 0) {
            reverseNumber = (reverseNumber * 10) + inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        System.out.println(reverseNumber);

        if (reverseNumber == originalNumber)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome ");


    }

}
