package com.LambdaLearning;

public class BasicLambda {

    public static void main(String[] args) {

        // lambda expression
        Car c1 = (speed) -> speed;

        int test = c1.drive(100);

        System.out.println(test);
    }

}

@FunctionalInterface
interface Car {

    public int drive(int speed);

}

