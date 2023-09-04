package com.Lyambda.lesson39or38.povtoruporyadochil.Rabota_nadOshibkamy.TwO1;

import java.util.Iterator;

public class List1_Proverka {
    static <T> void printByIterator(Iterator<T> it){
        while (it.hasNext()){
//щоб перейтина наступний елемент
            T item = it.next();
            if (item == null) {
                System.out.println(" warning: item is null ");
            }
            System.out.println(item);
        }
    }
}
