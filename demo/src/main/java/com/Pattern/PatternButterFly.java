package com.Pattern;

public class PatternButterFly {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * n; j++) {

                if (j <= i) {
                    System.out.print("*");
                } else if (j > (2 * n) - i) {
                    //System.out.print(j);
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        // 2nd loop for butterfly
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= 2 * n; j++) {

                if (i > j - 1) {
                    System.out.print("*");
                } else if (j > (2 * n) - i) {
                    //System.out.print(j);
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }


}