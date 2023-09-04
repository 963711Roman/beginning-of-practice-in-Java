package com.Lyambda.io.kom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Collections;
import java.lang.Comparable;

public class PersonRefractoryng01 implements Comparable <PersonRefractoryng01> {
    public static  int counter;
    static ArrayList<PersonRefractoryng01> person2 = new ArrayList<PersonRefractoryng01>();
    public String name;
    //public int age;
    //private int age;
    private int birthYear;//рік народження
    //щоб отримати поточний рік треба створити обєкт Date()
    //і визвати в нього метод getYear і прибавити до ньго 1900
    //потім відняти рік народження
    public int getAge() { //вираховуємо вік
        //return age;
        return new Date().getYear() + 1900 - birthYear;
    }
    public void setAge(int age) { //вираховуємо рік народження використовуючи
        // поточний рік тобто new Date().getYear() + 1900
        //від поточного року віднімаємо вік
        this.birthYear = new Date().getYear() + 1900 - age;
    }
    private PersonRefractoryng01(String name, int age) {
    setAge(age);
        //this.age = age;
    this.name = name;
    }
    public static final Comparator<PersonRefractoryng01> ByName = (p1, p2) ->  p1.name.compareTo(p2.name);
    private PersonRefractoryng01(String name) {
    this(name, 42);
    }
    private PersonRefractoryng01() {
    this("gloria");
    }
    public static void showAll() {
        /*
        class ComparePersonRefractoryng01ByName implements Comparator<PersonRefractoryng01>{
            @Override
            public int compare (PersonRefractoryng01 p1, PersonRefractoryng01 p2){
                return p1.name.compareTo(p2.name);
            }
        }
        ComparePersonRefractoryng01ByName f = new ComparePersonRefractoryng01ByName();
        */
        /* Comparator <PersonRefractoryng01> f = new Comparator<PersonRefractoryng01>(){
            @Override
            public int compare (PersonRefractoryng01 p1, PersonRefractoryng01 p2){
                return p1.name.compareTo(p2.name);
            }
        };  */


            /*  Collections.sort(person2, new Comparator<PersonRefractoryng01>(){
                @Override
                public int compare (PersonRefractoryng01 p1, PersonRefractoryng01 p2){
                    return p1.name.compareTo(p2.name);
                }
            });
            */

        //Collections.sort(person2,  (p1, p2) ->  p1.name.compareTo(p2.name));

        Collections.sort(person2,  (p1, p2) ->  p1.getAge() - (p2.getAge()));
        Collections.sort(person2, ByName);




        for (PersonRefractoryng01 p : person2)
            p.show7();
        // ? counter ++ ;
    }
    public void show7() {
        System.out.printf("%s - %d \n", this.name, getAge());
    }

    public static PersonRefractoryng01 create(String name, int age) {

        PersonRefractoryng01 p = new PersonRefractoryng01(name, age); // это мы создаем объект класса  а потом
        // добавляем его в коллекцию
        person2.add(p);
        return p;
    }
    public static void ShowCounter() {
        System.out.printf("Total person2 : %d\n", PersonRefractoryng01.counter);

    }
    @Override
    public int compareTo(PersonRefractoryng01 p){
        //return this.name.compareTo(p.name);
        return this.getAge() - p.getAge();
    }
}
