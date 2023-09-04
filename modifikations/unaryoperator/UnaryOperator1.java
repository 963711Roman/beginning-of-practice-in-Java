package com.Lyambda.modifikations.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperator1 {
    public static void main(String[] args) {
        UnaryOperator<String> uo = s -> s.toUpperCase();
        //мщжна і так але це не рентабельно
       // Function<String, String> uo1 = s -> s.toUpperCase();
        System.out.println(uo.apply("java 12"));
    }
}
