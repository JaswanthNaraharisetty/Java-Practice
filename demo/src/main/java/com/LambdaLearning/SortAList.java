package com.LambdaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAList {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names = Arrays.asList("apple", "banana", "kiwi", "mango");

        SortInputList s2 = (inputlist) -> {

            Collections.sort(inputlist);
            System.out.println(inputlist);
            return inputlist;
        };

        s2.sortList(names);

    }

}

@FunctionalInterface
interface SortInputList {
    public List<String> sortList(List<String> inputList);
}
