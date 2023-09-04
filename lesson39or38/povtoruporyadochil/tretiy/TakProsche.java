package com.Lyambda.lesson39or38.povtoruporyadochil.tretiy;

import com.Lyambda.lesson39or38.povtoruporyadochil.second.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ReverseIterator<T> implements Iterator<T> {
    public ReverseIterator(List<T> list){
        this.list = list;
        index = list.size();
    }
    private List<T> list;
    private  int index;
    @Override
    public boolean hasNext() {
        return index > 0 ;
    }

    @Override
    public T next() {
        index -- ;
        return list.get(index);
    }
}

public class TakProsche {

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
        ReverseIterator<Integer> reverseIt = new ReverseIterator<>(list);
printByIterator(reverseIt);
    }
}
