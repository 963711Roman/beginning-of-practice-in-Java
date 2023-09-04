package com.Lyambda.escho;

import java.lang.ref.Cleaner;

public class Shirt extends  Clothing implements Cleaner.Cleanable {
    //конструктор дочірнього класу визиває конструктор того від якого унаслідує всі методи але тут дефолтний конструктор не може визвати абстрактний бо в батьківському класі нема дефолтного конструктора
    //тому створюю свій конструктор добавивши явно конструктор визиваємо той що в батьківському абстрактному класі

    public Shirt(String name, int size,  int price){
    super(name, size);
        setPrice(price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void wash() {
        System.out.println("Short is clean");
        setSize(getSize() - 1);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", price=" + price +
                '}';
    }


    private  int price;


    @Override
    public void clean() {

    }

    @Override
    public String howToClean() {
        return "30 degree";
    }
}
