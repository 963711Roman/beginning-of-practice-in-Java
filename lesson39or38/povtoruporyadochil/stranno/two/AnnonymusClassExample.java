package com.Lyambda.lesson39or38.povtoruporyadochil.stranno.two;

import java.util.Iterator;
import java.util.List;
// ТУТ ПРО ВИКОРИСТАННЯ ІТЕРАТОРА
//це приклад  другий по  використанню ітератора
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

//ІТЕРАТОР ФІЛЬТР
//"one" , "two" , " " , "four" , null , "six";
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


