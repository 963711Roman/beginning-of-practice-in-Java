package com.Lyambda.thread.prosche;
import java.util.function.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        final Consumer<String> printer = System.out::println;
            printer.accept("1");


    }
}
