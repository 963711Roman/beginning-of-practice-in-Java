package com.Lyambda.consumer145;
//приймаєм на вход обєкт вказаного типу (в нашому випадку Phone) і
// виводимо повідомлення
import com.Lyambda.consumer145.Phone;

import java.util.function.Consumer;

public class Consumertwo {



    public static void main(String[] args) {
        Consumer<Phone> consumer9 = tel -> System.out.println("продали телефон" + tel);
consumer9.accept(new Phone("2323232322" , "sigma", 56));
    }
}
