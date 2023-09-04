package com.Lyambda.consumer145;

import java.util.function.Consumer;
//обєднали дві дії два консюмера в одну але вказади ПОЧЕРЕДНОСТЬ В
// ЯКОМУ ПОРЯДКУ ВИКОНУВАТИ ДІЇ
public class Consumerobedenitvserazom {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        //printUpperCase.accept("helo");
        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());
        printUpperCase.andThen(printLowerCase).accept("Hello world");
    }
}
