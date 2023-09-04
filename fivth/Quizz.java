package com.Lyambda.fivth;
import java.util.function.Consumer;
import java.util.function.Function;

public class Quizz {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        Consumer<String> consumer2 = A :: new;
        //тут конструктр new цеметод однаковий по своїй сигнатурі
         // з методом Consumer ідеально співпадає
        Function < B, String > f = new Function<B, String>() {
            @Override
            public String apply(B b) {
                return b.getB();
            }
        };
        //та ось так краще тут f = f1
        Function <B, String> f1 = B :: getB;
        f1.apply(new B());
        // в джава завжди у всі нестатичні методи передається this і
        // туди передається указатель на тот клас у которого визивається метод тому
        //на вход В навиході стрінг так як у консюмера
    }

    static class  A {
        final String a;
        public A(final String a) {
            this.a = a;
        }
    }
    static class B {
        final String b = "ololo";
        public String getB(/* B this */){
            return b;
        }

    }
}
