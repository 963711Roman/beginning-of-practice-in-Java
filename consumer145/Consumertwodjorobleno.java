package com.Lyambda.consumer145;

import com.Lyambda.consumer145.Phone;
//обєднали дві дії два консюмера в одну
import java.util.function.Consumer;

public class Consumertwodjorobleno {
    public static void main(String[] args) {
        Consumer<Phone> consumer9 = tel -> System.out.println("продали телефон" + tel);
        Consumer<Phone> consumer10 = tel -> System.out.println("Відправляємо телефон" + tel);
        consumer9.andThen(consumer10).accept(new Phone("2323232322" , "sigma", 56));
    }
}
