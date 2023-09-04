package com.Sintaksis.Dva.repeat;
//другорядні методи
public class Matemat {
    // тепер те що головне


    //другорядні методи
    //static int e;
   // static int f;
    //static int d;

    public  int Minus( int e, int f){
         int d = e - f;
        System.out.println(d);
        return 0;
    }
    public int CiklFor(){

        return 0;
    }

    int a;
    int b;
    int c;
    public int Summa(int a, int b){
        c = a + b;
        System.out.println(c);
        return 0;
        //другорядні методи
    }


    public static void main(String[] args) {
        //другорядні методи
        Matemat s = new Matemat();
       int e = 15;
       int f = 5;
       s.Minus(e, f);
       s.Summa( 10, 5);
// це були другорядні методи

    }


}
