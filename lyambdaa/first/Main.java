package com.lyambdaa.first;
//лямбда це реалізація інтерфейсу не через клас а відразу в потрібному місці (пропиши код реалізації ті імя інтерфейсу )
public class Main {
    public static void main(String[] args) {

        //MyNumber MyNum;
        /*
        синтаксис лямбда
         начало
        //MyNumber MyNum = () -> 123;
        //System.out.println(MyNum.someNumber());

        //лямбда посложнее
        MyNumber MyNum = (i) -> i * 2;
        System.out.println(MyNum.someNumber(10));
        */
        MyNumber MyNum = (i, t) -> {
            int a;
            if (i < t) {
                a =i;
            } else a = t;
            return a;
        };
        System.out.println(MyNum.someNumber(3, -8));
    }
}
