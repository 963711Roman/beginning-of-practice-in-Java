package com.Lyambda.anonimniklass;
import com.Lyambda.Moveable;
public class MoveableDemo {
    public static void main(String[] args) {
        Moveable moveable = new Moveable() {
            @Override
            public void moveRight()
            {
                    System.out.println("MOVING RIGHT");

            }
            @Override
            public void moveLeft()
            {
                    System.out.println("MOVING Left");

            }
        };
            moveable.moveLeft();
            moveable.moveRight();


    }
}
