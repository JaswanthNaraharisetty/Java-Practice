package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenAListOfLists {

    public static void main(String[] args) {

        List<List<Integer>> nested = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));

        List<Integer> finallist =  nested.stream().flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(finallist);


    }

}
