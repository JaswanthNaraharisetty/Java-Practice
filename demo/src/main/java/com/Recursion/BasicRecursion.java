package com.Recursion;

public class BasicRecursion {

    public static void main(String[] args) {
        printMessage(1);


    }

    public static int printMessage(int count) {

        System.out.println("Hello Recursion " + count);
        count++;
        if (count <= 10)
            printMessage(count);

        return count++;
    }

}
