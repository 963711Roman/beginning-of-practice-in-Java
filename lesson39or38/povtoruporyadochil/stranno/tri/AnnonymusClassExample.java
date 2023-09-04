package com.Lyambda.lesson39or38.povtoruporyadochil.stranno.tri;

import com.Lyambda.lesson39or38.*;
//import com.Lyambda.lesson39or38.ReverseIterator;

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

class FilterIterator implements Iterator<String> {
    public FilterIterator (List<String> list){
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
            // (list.get(index) != null це означає
            // ЯКЩО ВЗЯТИЙ ЕЛЕМЕНТ IЗ ВЗЯТИМ ІНДЕКСОМ НЕ Є NULL;
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

////це приклад  перший по  використанню ітератора
public class AnnonymusClassExample {
//тут просто друкуємо з початку до кінця
    static <T> void printByIterator(Iterator<T> it){
        while (it.hasNext()){
//щоб перейтина наступний елемент
            T item = it.next();
            if (item == null) {
                System.out.println(" warning: item is null ");
            }
            //ТУТ ВСЕ ОДНО ВИВОДИТЬ NULL
            System.out.println(item);
        }
    }
    class SamList implements Iterable<Integer> {

        private class SomeListIterator implements Iterator<Integer> {
           /*
            private SomeListIterator() {
            }

            */
            private int index = - 1;
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        }
        public void  SomList( int size){
            array = new int[size];
        }
        public int get(int i){
            return array[i];
        }
        public void set(int i , int value ) {
            array[i] = value;
        }
        private  int[] array;

        @Override
        public Iterator<Integer> iterator() {
            return null;
            //отримати окремий елемент за допомогою Iterator
        }
    }
    static void example2(){
        List<String> list = new ArrayList<>();
        list.add("one"); list.add("two");   list.add("");
        list.add(null);  list.add("four");   list.add("six");
        //("one" , "two" , " " , "four" , null , "six");

        for (String str :
             list) {
            System.out.println(str);
        }

        // або можна і щсь так
        System.out.println("--base iterator--");
        System.out.println("*********/////////////////******");
        printByIterator(list.iterator());
//РЕЗУЛЬТАТ НА ВІДЕО НА ТАЙМКОДІ 1 00 20
        FilterIterator it = new FilterIterator(list);
        System.out.println("\n --filter iterator--");
        printByIterator(it);
        System.out.println("*******/////////////////////////****");
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>(java.util.List.of(4, 7, 3));
        /*
        //це без ітератора
        for (Integer item :
             List) {
            System.out.println(item);

        }

         */
        //це приклад  перший по  використанню ітератора
        //тепер те саме але через ітератор
        //чи є наступний елемент в колекції який можна
        // отримати через ітератор
        //це робиться через hasNext якщо є наступний елемент
        // то можна з ним працювати якщо тру і ні то ні тобто фолс

        Iterator<Integer> it = List.iterator();
        System.out.println("***************************0");
        printByIterator(it);//це спрацювало
        System.out.println("*************************** 0");

        while (it.hasNext()){
//щоб перейти на наступний елемент
            Integer item = it.next();
            System.out.println(item); //це не спрацювало

        }
            System.out.println("/*/-/-/*/*/-*-/-*/-*//*/");
        printByIterator(it);//це не спрацювало?
        System.out.println("****************************** 0-1");
        //це приклад  другий по  використанню ітератора
        ReverseIterator<Integer> reverseIt = new ReverseIterator<Integer>(List);
            while (reverseIt.hasNext()) {
                Integer item = (Integer) reverseIt.next();
                    System.out.println(item); //це спрацювало
                System.out.println("***************************1");
}


        printByIterator(reverseIt); //це не спрацювало
        System.out.println("***************************2");
        System.out.println("---------------------------------");
        //ТЕ ЩО ПРОПИСАНО ЧЕРЕЗ ЦИКЛ WHILE  НЕ СПРАЦЮВАЛО
        example2();
    }
}
