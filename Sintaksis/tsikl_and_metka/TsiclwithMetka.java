package com.Sintaksis.tsikl_and_metka;

public class TsiclwithMetka {
    public static int Metka () {
        outher: for (int j = 0; j < 10; j++ ){
    for (int i = 0; i < 10; i++ ){
        if ((i + j) % 4 == 3 && i > 5){
           //continue outher;
            break outher;
        }
        System.out.println(i + " " + j);
        System.out.println("-----------");
    }
}
        System.out.println("--**--**--");
        return 10;

    }
    public static int Metk () {
        outher: for (int j = 0; j < 10; j++ ){
            for (int i = 0; i < 10; i++ ){
                if ((i + j) % 4 == 3 && i > 5){
                    continue outher;
                    //break outher;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("--**--**--");
        return 10;
    }
    public static void main(String[] args) {
        Metka();
        Metk();
    }
}
