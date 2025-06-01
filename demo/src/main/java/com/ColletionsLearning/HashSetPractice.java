package com.ColletionsLearning;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {

        Set<String> StringSet = new HashSet<String>();

        StringSet.add("New York");
        StringSet.add("London");
        StringSet.add("Tokyo");
        StringSet.add("Sydney");
        StringSet.add("Berlin");
        StringSet.add("Toronto");
        StringSet.add("New York");

        for (String s : StringSet) {
            System.out.println(s);
        }
    }

}
