package com.basicMaths;

public class GCDCalculator {

    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 60;

        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        // Handle negative inputs (optional)
        a = Math.abs(a);
        b = Math.abs(b);

        // Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            System.out.println(a);
        }

        return a;
    }
}
