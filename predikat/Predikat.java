package com.Lyambda.predikat;
import java.util.function.Predicate;

//надо проверить является число положительним или отрицательним

public class Predikat {
    public static void main(String[] args) {
        Predicate<Integer> negative = i -> i < 0;

        System.out.println(negative.test(-6));
        System.out.println(negative.test(6));
        System.out.println(negative.test(0));
    }

}
