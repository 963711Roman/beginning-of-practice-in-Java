package com.Lyambda.io.kom;
//package io.kom.*;
import java.util.ArrayList;
//import java.util.ArrayList.ArrayList;
public class PersonRefractoryng {

    public static void main(String[] args) {
        System.out.printf("Total person2 : - %d\n", PersonRefractoryng01.counter);

        //* PersonRefractoryng01.ShowCounter();
        PersonRefractoryng01.create("Grey", 45);
       PersonRefractoryng01 k = PersonRefractoryng01.create("Gavriil", 41);
        PersonRefractoryng01 k5 = PersonRefractoryng01.create("Gavira", 21);
        PersonRefractoryng01.create("Gary", 25);
        //PersonRefractoryng01 k = new PersonRefractoryng01("Gavriil", 41); // вместо этого

                                PersonRefractoryng01 s =  PersonRefractoryng01.create("fert" , 48); // во  это Person2 s = Person2.create("fert" , 48);
        //"fert" створено методом create
        // имя и возраст я специально поменял  что б проверить
       //*  k.show7();

        //PersonRefractoryng01 h = PersonRefractoryng01.create();
        //h.show7();

        /*
        PersonRefractoryng01 e = PersonRefractoryng01.create("Merry");

        //PersonRefractoryng01 e = new  PersonRefractoryng01("Merry");
        e.show7();
        // Person2 o = new Person2();
        //o.show7();
       PersonRefractoryng01 t = PersonRefractoryng01.create("Gravri", 21);

        //PersonRefractoryng01 t = new  PersonRefractoryng01("Gravri", 21);
        t.show7();
        PersonRefractoryng01 y = PersonRefractoryng01.create();

        //PersonRefractoryng01 y = new  PersonRefractoryng01();
        y.show7();
*/
        //Person2 s = Person2.create("fert" , 48);
//эт опечать всех объектов имя и возраст каждого человека
        //PersonRefractoryng01 po = PersonRefractoryng01.create();

        //PersonRefractoryng01 po = new PersonRefractoryng01();
        PersonRefractoryng01.showAll();
//эт опечать всех объектов имя и возраст каждого человека

       //* PersonRefractoryng01.ShowCounter();
        //System.out.printf("Total person2 : - %d\n", Person2.counter);
/*
        Singleton r1 = new Singleton();
        Singleton r2 = new Singleton();
        System.out.println(r1 == r2);

 */

    }
}
