package com.LUCHSHIYprimer_OBRAZETS.laymbda.Vse_Prosto;

public class Test2 {
    static void def(I i) {
        //static void def(I i) означає що ми реалізуємо інтерфейс
        //тут задав з чим треба працювати задав вхідні дані
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        final int i = 10;
        //тут напряму прописалв реалізацію методу і інтерфейсу що саме він має робити і як саме
        def((String str) -> {return str.length() + i; });
        //System.out.println();
    }
}

interface I {
    int abc(String s);
}