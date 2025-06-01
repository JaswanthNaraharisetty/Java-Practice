package com.example;

import java.util.Scanner;

public class SolutionPrintNumber {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner myObj = new Scanner(System.in)) {
            printNumber(myObj);
        }
    }

    // Changed to static
    public static void printNumber(Scanner sc) {
        int numberValue = sc.nextInt();
        System.out.println(numberValue);
    }
}
