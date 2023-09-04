package com.Lyambda.lesson39or38.RabochiyKod.fivth;

//import com.Lyambda.lesson39or38.povtoruporyadochil.chetvertiy.ReverseIterator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class ReverseIteratorAnalog<T> implements Iterator<T> {
    public ReverseIteratorAnalog(List<T> list){
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

class FilterIterator implements Iterator<String> {

    //відфільтровуємо null i пусті строки
    // ot tak index < list.size() && (list.get(index) == null || list.get(index).isEmpty())){
    //            index ++;

    //"one" , "two" , " " , "four" , null , "six";
    public FilterIterator(List<String> list){
        this.list = list;
        index = 0;
    }
    private List<String> list;
    private  int index;
    @Override
    public boolean hasNext() {
        while (true) {
            if (index >= list.size()) {
                return false;
            }
            if ((list.get(index) != null && !list.get(index).isEmpty())) {
                return true;
            }
            index++;

        }
    }

    @Override
    public String next() {
        String str = list.get(index);
        index ++ ;
        return str;
    }

}


public class Escho_raz {

    static <T> void printByIterator(Iterator<T> it) {
        while (it.hasNext()) {
            T item = it.next();
            if (item == null) {
                System.out.println("wraning : item is null");//не виводиться це повідомлення
            }
            else {
                System.out.println(item);
            }
        }

    }
    static void exemple1(){
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(6, 9, 2));
        Iterator<Integer> it = list.iterator();
        printByIterator(it);
        System.out.println();
        ReverseIteratorAnalog<Integer> reverseIt = new ReverseIteratorAnalog<>(list);
        System.out.println("**||//");
        printByIterator(reverseIt);
        System.out.println("**||//");
    }
    static void exemple2() {
List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("");
        list1.add(null);
        list1.add("four");
        list1.add("six");

        for (String str :
             list1) {
            System.out.println(str);
        }

        System.out.println();
        System.out.println("base iterator");
        System.out.println("---------------------");
            printByIterator(list1.iterator());
        FilterIterator it = new FilterIterator(list1);
        System.out.println("\n filter iterator");
        printByIterator(it);
    }
    public static void main(String[] args) {
            exemple2();
            System.out.println(" ** ");
        exemple1();
    }
}
