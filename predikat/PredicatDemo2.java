package com.Lyambda.predikat;

import java.util.function.Predicate;

public class PredicatDemo2 {
    public static void main(String[] args) {
        //перший та другий предикати виявлють чи є в рядку вказаний символ
        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("B");
        //порівняння двох предикатів(результтау їх роботи) та перевірка чиє
        // рядок комбінацією вказаних символів
        System.out.println(containsA.and(containsB).test("ABCD"));
    }
}
