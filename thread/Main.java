package com.Lyambda.thread;
//import  java.util.function;
//import java.util.function.Consumer;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        final Consumer <String> printer = new Consumer<String>(){

            @Override
            public void accept(String target){
System.out.println(target);
            }
        };
        printer.accept("1");
    }

}
