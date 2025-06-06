package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsbyTheirLength {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("a", "bb", "ccc", "dd", "e");

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength);


    }

}
