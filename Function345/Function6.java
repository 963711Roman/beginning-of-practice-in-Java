package com.Lyambda.Function345;
//на вход число на виході фраза про тте що це за
// число після його перевірки

import java.util.function.Function;

public class Function6 {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> {
            String result = "Нуль";
            if (i > 0) {
                result = "число додатне";
            } else if (i < 0) {
                result = "число відємне";

            }
            return result;
        };
        System.out.println(function.apply(-9));
        System.out.println(function.apply(0));
        System.out.println(function.apply(99));
    }
}
