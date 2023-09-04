package com.Lyambda.thread.pravilno;
import java.util.function.*;
import java.util.function.Consumer;
public class Main {
    public static void main(String[] args) {
        final Consumer<String> printer = s -> System.out.println(s);
        //вот так правильгіше final Consumer<String> printer = s -> System.out::println;
       //і так тоже можна  final Consumer<String> printer = s -> { printer.accept(t);}; це визов из лямбди лямбду тобто
        // ван сама себе визиває
        printer.accept("1");
    }
}
