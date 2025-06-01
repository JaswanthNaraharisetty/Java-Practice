package com.Pattern;

public class PatternUpAndDown {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd loop for butterfly
        for (int i = n; i > 1; i--) {

            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
