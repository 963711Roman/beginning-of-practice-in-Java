package com.Lyambda.graph;
//package com.Lyambda.graph.*;
import java.io.Serializable;

public class Circle2 extends Shape2 implements Scaleable, Serializable, Moveble {
    //початок ікапсуляції тобто це єксплуатація модифікаторів доступу
    //виділив поля х у правою кнопкою миші і вибрав
    // пункт generate а потім вибрав пункт гет та сет
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x;
    private int y;
    //початок ікапсуляції тобто це єксплуатація модифікаторів доступу
    private int r;

    public int getR (){
        return r;
    }
    public void setR(int r) {
        if (r > 0)
        this.r = r;
        else //повідомлення про помилку
        throw new RuntimeException("radius <= 0");
    }
    public Circle2(int x, int y, int r, String color) {
        super(color);
        System.out.println("Circle2 ctor");
        this.x = x;
        this.y = y;
        //this.r = r;
        setR(r);
    }
    public void scale(double factor) {
        //r = (int) (factor * r);
        setR((int) (factor * getR()));
    }
/*
   public void scale() {
        scale(DEFAULT_FACTOR);
    }
    */
    public void scale() {
        ((Scaleable)this).scale();
    }


    @Override
    public String toString() {
        return String.format("Circle2 (%d, %d) R: %d Color: %s" , x, y, getR(), color);
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
