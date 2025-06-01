package com.ColletionsLearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<String> tempList = new ArrayList<String>();

        tempList.add("Alice");
        tempList.add("Bob");
        tempList.add("Charlie");
        tempList.add("Diana");
        tempList.add("Ethan");
        tempList.add("Fiona");

        System.out.println(tempList);

        // tempList.remove(0);
        // tempList.remove("Alice");
        System.out.println(tempList);

        //Sorting in collections
        Collections.sort(tempList);

        // sorting in reverse order
        tempList.sort(Collections.reverseOrder());


        for (String name : tempList) {
            System.out.println(name);
        }


    }
}
