package com.Lyambda.lesson39or38.povtoruporyadochil.Prodoljeniye;
import java.util.Iterator;
public class GoogGo implements Iterable<Integer> {
    private  int[] array;
        public GoogGo(int size) {
            this.array = new int[size];
        }

        private class SomeListIterator implements Iterator<Integer> {
            private int index = 0;

            @Override
            public boolean hasNext()
            {
            return index < GoogGo.this.array.length;
            }

            @Override
            public Integer next()
            {
            return GoogGo.this.get(index ++);
            }
        }

        public int  SomList( int size){
        array = new int[size];
        return size;
        }
        public int get(int i){
        return array[i];
        }
        public int set(int i , int value ) {
        array[i] = value;
        return i;
        }


    @Override
    public Iterator<Integer> iterator() {
        return this.new  SomeListIterator();
        //отримати окремий елемент за допомогою Iterator
    }

    static  void examle3(){
        GoogGo List = new GoogGo(5);
        List.set(0, 5);
        List.set(1, 4);
        List.set(2, 8);
        List.set(3, 7);
        List.set(4, 9);
        for (int item :
             List) {
            System.out.println(item + " ");
        }
    }

    public static void main(String[] args) {
        examle3();
    }

}