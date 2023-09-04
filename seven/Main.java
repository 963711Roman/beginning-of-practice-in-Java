package com.Lyambda.seven;

import java.io.CharArrayWriter;

public class Main {
    public static void main(String[] args) {
        StringModificator sm = (text) -> {
            text.toUpperCase();
            String result = "";
            //CharArrayWriter text = null;
            //String text = null;
            for (char let : text.toCharArray()) {
                if (Character.isLetter(let) || let == ' ') {
                    result += let;
                }

            }
            return result;
        };
        System.out.println(sm.getString("hello 12345 world"));

    }
}
/*
  System.out.println(sm.getString("hello"));
                System.out.println(result);
 */