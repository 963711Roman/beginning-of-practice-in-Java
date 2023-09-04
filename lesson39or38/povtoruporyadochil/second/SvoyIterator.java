package com.Lyambda.lesson39or38.povtoruporyadochil.second;
//ЗАДАЧА ВИВЕСТИ НГА ЕКАРН КОЛЕКЦІЮ  В ЗВОРОТНЬОМУ ПОРЯДКУ
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


public class SvoyIterator {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(List.of(5, 4, 8));
        ReverseIterator<Integer> reverseIt = new ReverseIterator<>(list);
        while (reverseIt.hasNext()) {
            Integer itemn = reverseIt.next();
            System.out.println(itemn);
        }

    }
}
