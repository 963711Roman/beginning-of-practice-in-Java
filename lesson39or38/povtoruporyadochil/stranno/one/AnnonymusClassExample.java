package com.Lyambda.lesson39or38.povtoruporyadochil.stranno.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SomeList implements Iterable<Integer> {
public int Somelist(int size) {
    array = new int[size];
    return size;
}
public  int get(int i) {
    return array[i];
}
public void set(int i , int value) {
    array[i] = value;
}
private int[] array;

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}

public class AnnonymusClassExample {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1, 2, 3));
        for (Integer item :
             list) {
            System.out.println(item);
        }
        System.out.println("_______________________");
        //System.out.println("\n");

        ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(4, 7, 5));
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            Integer item = it.next();
            System.out.println(item);
        }
        System.out.println("_______________________");
        System.out.println("\n");
    }
}
