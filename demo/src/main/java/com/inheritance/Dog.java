package com.inheritance;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("In Dog Class");
    }
}
