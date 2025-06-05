package com.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringWithStream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alexander", "Mike", "Elizabeth");

       names.stream()
                .max(Comparator.comparing(String::length)).stream().forEach(n -> System.out.println(n));

    }

}
