package com.Lyambda.geekbrains;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.addAll(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
        //по старому
        for (Integer v :
             values) {
            System.out.println(v + " ");
                    }
        System.out.println( " \n");
                // тепер по новому менше писать кода
                values.forEach(v -> System.out.println( v + " "));
        //або ось так якщо сигнатура методів співпадає
                values.forEach(System.out::println);

        System.out.println( " \n");
                //тепер видалимо елементи котрі більше ніж 5
        Predicate<Integer> pft = v -> v > 5;
        values.removeIf(pft);
        for (Integer v :
             values) {
            System.out.println(v);
        }
        //тепер про стріми
        //задача вибери максимальне значення з массиву
        Integer m = 0;
        for (Integer v :
             values) {
            if (v > m)
                m = v;


        }

        //за допомогою стрімів
        values.stream().max(Integer::compareTo).get();


    }
    //тепер про доступ до змінних
    // не можна використовувати змінні які використовувались раніше
    //але в лямбда треба використовувати тільки ссилочний тип данних
    public void  test (Integer a , Integer b) {
        //так було раніше
        Runnable r = new Runnable() {
          @Override
          public void run() {

          }
        };
        // ось так можна зараз
        Runnable r1 = () -> {

        };
    }
}
