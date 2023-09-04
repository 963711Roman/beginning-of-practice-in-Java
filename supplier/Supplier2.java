package com.Lyambda.supplier;

import java.util.function.Supplier;

//напиши лямбда вираз який повертає случайне число від 1 до 10
// переробимо тип данних в інт бо в класі Маth метод random
// длягенерації випадкових чисел видає тип дабл і помножимо на 10 бо
// цей метод видає тільки від 0 до 1
public class Supplier2 {
    public static void main(String[] args) {
        Supplier<Integer> sp = () -> (int) (Math.random() * 10);
        System.out.println(sp.get());
    }
}
