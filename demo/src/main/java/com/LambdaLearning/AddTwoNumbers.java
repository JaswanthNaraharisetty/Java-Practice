package com.LambdaLearning;

public class AddTwoNumbers {

    public static void main(String[] args) {
        AddNumbers a1 = (a, b) -> {
            System.out.println("Sum is " + (a + b));
            return a + b;
        };

        AddNumbers a2 = (a, b) -> Integer.sum(a, b);

        a1.sumofNumber(10, 20);
        a2.sumofNumber(10, 20);

    }


}


interface AddNumbers {
    public int sumofNumber(int a, int b);
}
