package com.LUCHSHIYprimer_OBRAZETS.vnutrishniyClass.VnutrinniyClas;

public class Main {
    public static void main(String[] args) {
        MathFunction mf = new MathFunction();
        System.out.println(calculate(mf.getSquare(), 1, 4));
        System.out.println(calculate(mf.getCube(), 1, 4));
    }
    public static int calculate(Functionfig fun , int begin, int and){
        return fun.calculate(begin, and);
    }
}
