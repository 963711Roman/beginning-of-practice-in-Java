package com.Lyambda.predikat;
//1. возвращать тру если строка не нул
//
//2. проверка строка что не является пустой ну типа !s.isEmpty()
import java.util.function.Predicate;

public class PredicatDemo {
    public static void main(String[] args) {
        /*
        //начнемо з анонімного класу
        Predicate<String> predicate1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s != null;
            }
        };
        */
        //тепер реалізуємо це через лямбду
        Predicate<String> predicate1 =  s -> s != null;
        Predicate<String> predicate2 =  s -> !s.isEmpty();



        //тепер все за раз і перевірили на нул і на пустоту
        Predicate<String> predicate4 =  s -> s != null && !s.isEmpty();
        System.out.println(predicate4.test(null));
        System.out.println(predicate4.test(""));
        System.out.println(predicate4.test("someString"));



        //метод and обєднує два предикати і вертає третій
        Predicate<String> predicate3 = predicate1.and(predicate2);


        //ось так це прописується одним рядком і обєднали і перевірили на нул
        System.out.println(predicate1.and(predicate2).test(null));

        System.out.println(predicate3.test(null));
        System.out.println(predicate3.test(""));
        System.out.println(predicate3.test("someString"));
////тепер все за раз і перевірили на нул і на пустоту





        //тепер визиваємо метод інтерфейсу предікат метод
        // називається test
        System.out.println(predicate1.test(null));
        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test("someString"));

//для третьогог предикату рядки 34 та 35 не потрібні
        //System.out.println(predicate2.test(""));
        //System.out.println(predicate2.test("someString"));
    }
}
