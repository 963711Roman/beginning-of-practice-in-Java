package com.Lyambda.lesson39or38.povtoruporyadochil.Rabota_nadOshibkamy.Tri_1;

//import com.Lyambda.lesson39or38.FilterIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exampl_ispravleniya {
    public static class FilterIterator implements Iterator<String> {
        public  FilterIterator (List<String> list){
            //відфільтрувати пусті строки і також  String = null
            this.list = list;
            index = 0;
            //index = list.size();
            //index = list.size() - 1;
        }
        private List<String> list;
        private int index;


        @Override
        public boolean hasNext() {
            //МЕТОД hasNext ГОВОРИТЬ ЧИ МОЖНА ОТРИМАТИ ПЕРШИЙ ЧИ НАСТУПНИЙ ЕЛЕМЕНТ
            while (true) {
                if (index >= list.size()){ // якщо дійшли до останнього елементу
                    return false;
                }
                //ЯКЩО ВЗЯТИЙ ЕЛЕМЕНТ IЗ ВЗЯТИМ ІНДЕКСОМ НЕ Є NULL;
                if (list.get(index) != null && !list.get(index).isEmpty()) {
                    return true;
                }
                index ++;
            }

        }
        //ЯКЩО ПО МЕТОДУ NEXT МИ МОЖЕМ ОТРИМАТИ ЕЛЕМЕНТ ТО ТРЕБА ЩОБ HASNEXT ВИДАВ ТРУ
        //ЯКИЙ З ЦИХ МЕТОДІВ БУДЕ ПЕРШИМ АКТИВОВАНО А ЯКИЙ ДРУГИМ ТУТ НЕ МАЄ ЗНАЧЕННЯ
        @Override
        public String next() {
            String str = list.get(index);
            index ++;

            return str;
        }
    }
    static <T> void printByIterator(Iterator<T> it){
        while (it.hasNext()){
//щоб перейтина наступний елемент
            T item = it.next();
            if (item == null) {
                System.out.println("warning: item is null");
            }
            System.out.println(item);
        }
    }
    static void example2(){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("");
        list.add(null);
        list.add("four");
        list.add("six");
        //("one" , "two" , " " , "four" , null , "six");

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

//РЕЗУЛЬТАТ НА ВІДЕО НА ТАЙМКОДІ 1 00 20
        /*
        FilterIterator it = new FilterIterator(list);
        System.out.println("\n --filter iterator--");
                            System.out.println("example2|||||||");
        printByIterator(it);
System.out.println("example2|||||||");
*/
    }
    public static void main(String[] args) {
        example2();
    }
}

