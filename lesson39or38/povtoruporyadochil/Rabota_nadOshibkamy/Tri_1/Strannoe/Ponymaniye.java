package com.Lyambda.lesson39or38.povtoruporyadochil.Rabota_nadOshibkamy.Tri_1.Strannoe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Ponymaniye {
    static void example2() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("");
        list.add(null);
        list.add("four");
        list.add("six");
        //("one" , "two" , "" , "four" , null , "six");
        System.out.println("example2");
        for (String str :
                list) {
            System.out.println(str);
        }
        System.out.println("example2");
        // або можна і щсь так
        System.out.println("--base iterator--");
        System.out.println("example2*********");
        printByIterator(list.iterator());//ТУТ ВСЕОДНО ВИВОДИТЬ NULL
        System.out.println("example2*********");
    }
    static <T> void printByIterator(Iterator<T> it){
        while (it.hasNext()){
//щоб перейтина наступний елемент
            T item = it.next();
            if (item == null) {
                System.out.println("warning: item is null");
            }
            else
            System.out.println(item);
        }
    }


    public static void main(String[] args) {
        example2();
    }
}
