package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToUppercase {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        names = names.stream().map(n-> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(names);

    }
}
