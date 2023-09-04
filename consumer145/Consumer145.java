package com.Lyambda.consumer145;

import java.util.function.Consumer;

public class Consumer145 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("helo");
        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());
        printLowerCase.accept("Hello world");
    }

}
