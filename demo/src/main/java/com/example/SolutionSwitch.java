package com.example;

import java.util.Scanner;

class SolutionSwitch {
    public static void whichWeekDay(int day) {
        if (day<1 || day > 7){
            System.out.println("Invalid");
            return;
        }

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int numberValue = myObj.nextInt();
        whichWeekDay(numberValue);
        myObj.close();
    }
}