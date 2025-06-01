package com.Pattern;

public class PerfectTriangePattern {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 0; i < n; i++) {

            for (int k = i; k <= n / 2 + 1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
