package com.Lyambda.lesson39or38.povtoruporyadochil.Rabota_nadOshibkamy.TwO1;

import java.util.ArrayList;
import java.util.Iterator;

import static com.Lyambda.lesson39or38.povtoruporyadochil.Rabota_nadOshibkamy.TwO1.List1_Proverka.printByIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<Integer>(java.util.List.of(4, 7, 3));

        //це без ітератора
        for (Integer item :
                List) {
            System.out.println(item);

        }
        Iterator<Integer> it = List.iterator();
        printByIterator(it);
        while (it.hasNext()) {
//щоб перейтина наступний елемент
            Integer item = it.next();
            System.out.println(item);
            printByIterator(it);
        }
    }


    }

