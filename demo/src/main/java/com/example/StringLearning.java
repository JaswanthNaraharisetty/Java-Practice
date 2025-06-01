package com.example;

public class StringLearning {

    public static void main(String[] args) {
        String name = "Jaswanth Naraharisetty"; // most common way
        StringLength(name);
        StringReverse(name);
    }

    public static void StringLength(String name){
        System.out.println(name.length());
    }

    public static void StringReverse(String name){
        String reverse = "";
        char ch;
        for(int i=0;i<name.length();i++){
           // ch = name.charAt(i);
           reverse = name.charAt(i) + reverse;
        }

        System.out.println(reverse);
    }
}
