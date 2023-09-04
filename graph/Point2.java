package com.Lyambda.graph;
//package com.Lyambda.graph.*;
//import com.repet.graph.Shape2;
public class Point2 extends Shape2{
    public int x;
    public int y;
    //public String color;
    public Point2(int x, int y){
        this(x, y, DEFAULT_COLOR);
    }
    public Point2(int x, int y, String color){
        super(color);
        System.out.println("Point2 ctor");
        this.x = x;
        this.y =y;
        //this.color =color;
    }
    public void moveBy(int dx, int dy) {
        x += dx;
        y += dy;
    }
    @Override
    public void draw() {
        super.draw();
        System.out.printf("Point2 (%d, %d ). Color: %s\n" , x, y, super.color);
    }

    @Override
    public String toString() {
        return String.format("Point2 (%d, %d ). Color: %s\n" , x, y, this.color);
    }
    @Override
    /*
    protected Object clone() throws CloneNotSupportedException {
        return new Point2(this.x, this.y, this.color);
    }
*/
    public Point2 clone()  {
        return new Point2(this.x, this.y, this.color);
    }
}
