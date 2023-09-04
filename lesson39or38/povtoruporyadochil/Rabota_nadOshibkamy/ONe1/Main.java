package com.Lyambda.lesson39or38.povtoruporyadochil.Rabota_nadOshibkamy.ONe1;

//import com.Lyambda.lesson39or38.povtoruporyadochil.Rabota_nadOshibkamy.ONe1.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class  ReverseIterator<T> implements Iterator{
    public ReverseIterator(List<T> list){
        //перебираємо ліст від його кінця до його початку
        this.list = list;
        index = list.size();
        index = list.size() - 1;
    }
    private List<T> list;
    private int index;
    @Override
    public boolean hasNext() {
        //тут ми визначаємо чи є наступний елемент чи більше нема елементів
        //return index > 0;
        return index >= 0;// так тоже парацює
    }


    @Override
    public Object next() {
        /*
        //прохід по ліст від його кінця
        index --;
        //отримуєм елемент при переборі
        return list.get(index);
        */
        //так тоже працює
        T item = list.get(index);
        index -- ;
        return item;
    }
}

public class Main {



        static <T> void printByIterator(Iterator<T> it){
            while (it.hasNext()){
//щоб перейтина наступний елемент
                T item = it.next();
                if (item == null) {
                System.out.println(" warning: item is null ");
                    }
            System.out.println(item);
                }
        }


        public static void main (String[]args){

//ReverseIterator  ПРАЦЮЄ
            ArrayList<Integer> List = new ArrayList<Integer>(java.util.List.of(4, 7, 3));
            ReverseIterator<Integer> reverseIt = new ReverseIterator<Integer>(List);
            while (reverseIt.hasNext()) {
                Integer item = (Integer) reverseIt.next();
                System.out.println(item);
                printByIterator(reverseIt);
            }
        }

    }

