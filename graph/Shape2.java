package com.Lyambda.graph;
//package com.Lyambda.graph.*;
 import java.util.ArrayList;
public class Shape2 {
    public static final String DEFAULT_COLOR = "black";
    public String color;
    static ArrayList<Shape2> scence = new ArrayList<>();

    public Shape2() {
        this(DEFAULT_COLOR);
    }

    public Shape2(String color) {
        System.out.println("Shape2 ctor");
        this.color = color;
        scence.add(this);// це неправильно дивись в класі PersonRefractoryng01 як правильно
    }

    public static void drawScene() {
        for (Shape2 s : scence)
            s.draw();
    }

    public static void scaleScene(double factor) {
        for (Shape2 s :
                scence) {
            if (s instanceof Scaleable) {
                Scaleable sc = (Scaleable) s;
                sc.scale(factor);
            }
        }
    }

    public void draw() {
        System.out.printf("Shape2. color: %s\n", color);
    }
}

