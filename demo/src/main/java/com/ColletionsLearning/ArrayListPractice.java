package com.ColletionsLearning;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<String> tempList = new ArrayList<String>();
        Map<String, Integer> mapforCount = new HashMap<String, Integer>();

        tempList.add("Alice");
        tempList.add("Bob");
        tempList.add("Charlie");
        tempList.add("Diana");
        tempList.add("Ethan");
        tempList.add("Fiona");
        tempList.add("Alice");

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

            if (mapforCount.get(name) == null) {
                mapforCount.put(name, 1);

            } else {
                mapforCount.put(name, mapforCount.get(name) + 1);
            }


        }
        
        System.out.println(mapforCount);

    }
}
