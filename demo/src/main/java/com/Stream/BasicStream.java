package com.Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class BasicStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,3,2,1,2,31,1,2);

        numbers.stream().map(n->n*2).forEach(n-> System.out.println(n));
        numbers.stream().filter(n -> n%2 ==1).map(n->n*2).sorted().forEach(n-> System.out.println(n));


    }
}
