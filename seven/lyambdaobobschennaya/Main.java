package com.Lyambda.seven.lyambdaobobschennaya;

public class Main {
    public static void main(String[] args) {
        Modificatror<String> mod = (text) -> text.toUpperCase();

        System.out.println(mod.modificator("hello"));
    }
}
