package com.Lyambda.supplier;

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
        String t = "One";
        Supplier<String> sup = () -> t.toUpperCase();
        System.out.println(sup.get());
    }
}
