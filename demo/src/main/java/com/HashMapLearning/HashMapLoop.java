package com.HashMapLearning;

import java.util.HashMap;
import java.util.Map;

public class HashMapLoop {

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, Integer> i : scores.entrySet()) {
            System.out.println("Key = " + i.getKey() +
                    ", Value = " + i.getValue());
        }
    }

}
