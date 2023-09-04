package com.Lyambda.lesson39or38.RabochiyKod.filterup;
//import com.Lyambda.lesson39or38.povtoruporyadochil.fivth; анонімний клас не імпортується
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class FilterIterator1 implements Iterator<String> {

    //відфільтровуємо null i пусті строки
    // ot tak index < list.size() && (list.get(index) == null || list.get(index).isEmpty())){
    //            index ++;

    //"one" , "two" , " " , "four" , null , "six";

    public FilterIterator1(List<String> list){
        this.list = list;
        index = 0;
    }
    private List<String> list;
    private  int index;
    @Override
    public boolean hasNext() {
        while (true){
            if (index >= list.size()){
                return  false;
            }
            if ((list.get(index) != null && !list.get(index).isEmpty())){
            return true;
                }
            index ++;

        }
    }

    @Override
    public String next() {
        String str = list.get(index);
        index ++ ;
        return str;
    }

}




public class Filtruu {
    static <T> void printByIterator(Iterator<T> it) {
        while (it.hasNext()) {
            T item = it.next();
            if (item == null) {
                System.out.println("wraning : item is null");
            }
            else {
                System.out.println(item);
            }
        }
    }
    static void exemple2() {
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("*");
        list1.add("  ");

        list1.add("four");
        list1.add(null);
        list1.add("six");
        for (String str :
                list1) {
            System.out.println(str);
        }



        System.out.println("base iterator");
        System.out.println("---------------------");
        System.out.println();

            printByIterator(list1.iterator());

        FilterIterator1 it = new FilterIterator1(list1);
        System.out.println("\nfilter iterator");
        printByIterator(it);
    }
    public static void main(String[] args) {
        exemple2();
    }
}
