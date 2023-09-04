package com.LUCHSHIYprimer_OBRAZETS.vnutrishniyClass.VnutrinniyClas;

public class MathFunction {
    private class Square extends Functionfig {
        @Override
        public int funcion(int n) {
            return n * n;
        }
    }
    private class Cube extends Functionfig {
        @Override
        public int funcion(int n) {
            return n * n *n;
        }
    }
    public Functionfig getSquare(){
        return new Square();
    }
    public Functionfig getCube(){
        return new Cube();
    }

}
