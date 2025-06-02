package com.HashMapLearning;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {
        String input = "aabbcddeff";
        String nonRepeatedValue = "";

        Map<String, Integer> countMap = new HashMap<String, Integer>();

        // Traverse the string
        for (int i = 0; i < input.length(); i++) {

            // Print current character
            if (countMap.get(input.charAt(i) + "") == null) {
                countMap.put(input.charAt(i) + "", 1);
            } else {
                countMap.put(input.charAt(i) + "", countMap.get(input.charAt(i) + "") + 1);
            }

        }

        for (String letter : countMap.keySet()) {
            if (countMap.get(letter) == 1) {
                nonRepeatedValue = letter;
                System.out.println(nonRepeatedValue);
                return;
            }


        }

    }
}
