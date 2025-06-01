package com.Pattern;

public class ButterFly {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 1; i <= 2 * n - 1; i++) {
            StringBuilder row = new StringBuilder();
            // ternary operator
            int currentRow = (i <= n) ? i : (2 * n - i); // Reverses after midpoint

            for (int j = 1; j <= 2 * n; j++) {
                if (j <= currentRow || j > (2 * n - currentRow)) {
                    row.append("*");
                } else {
                    row.append(" ");
                }
            }
            System.out.println(row);
        }
    }
}
