package com;

import java.util.*;

import java.util.function.Predicate;

public class Print {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        String test = "Hello World";
//        Predicate<String> p1 = s -> s.length() < 20;
//        System.out.println(p1);

        Predicate<String> test2 = Predicate.isEqual(test);

        System.out.println(test2.toString());
    }
}
