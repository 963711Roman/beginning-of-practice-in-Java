package com.Lyambda.anonimniklass;

public class Food {
    public static void main(String[] args) {
        Potato potato = new Potato() {
            @Override
            public void peel() {
                System.out.println("sfsghhrr");
            }
        };
        potato.peel();
    }
}
