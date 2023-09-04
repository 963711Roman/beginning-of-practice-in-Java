package com.Lyambda.lesson39or38.povtoruporyadochil.chetvertiy;

//import com.Lyambda.lesson39or38.povtoruporyadochil.tretiy.ReverseIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ReverseIterator2<T> implements Iterator<T> {
    public ReverseIterator2(List<T> list){
        this.list = list;
        index = list.size() - 1;
    }
    private List<T> list;
    private  int index;
    @Override
    public boolean hasNext() {
        return index >= 0 ;
    }

    @Override
    public T next() {
        T item = list.get(index);
        index -- ;
        return item;
    }
}

public class EschoRaz_vivod_naoborot {

    static <T> void printByIterator(Iterator<T> it) {


        while (it.hasNext()) {
            T item = it.next();
            System.out.println(item);
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(6, 9, 2));
        Iterator<Integer> it = list.iterator();
        printByIterator(it);
        System.out.println();
        ReverseIterator2<Integer> reverseIt = new ReverseIterator2<>(list);
        printByIterator(reverseIt);
        System.out.println();

    }
}