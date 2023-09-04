package com.Lyambda.modifikations.unaryoperator;

import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class IntSupplier1 {
    public static void main(String[] args) {
        IntSupplier intsup = () -> (int) (Math.random() * 10);
        System.out.println(intsup.getAsInt());

        //метод референс

        IntFunction<String> function = String::valueOf;
        System.out.println(function.apply(450));
        Supplier<String> newString = String::new;
        System.out.println(newString.get());
    }
}
