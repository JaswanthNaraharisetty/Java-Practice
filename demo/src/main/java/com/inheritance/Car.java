package com.inheritance;

public class Car extends Vehicle {

    public void openTrunk() {
        System.out.println("In Car class");
        super.startEngine();
    }

    public static void main(String[] args) {
        // openTrunk();
        Car vh = new Car();
        vh.openTrunk();

    }
}
