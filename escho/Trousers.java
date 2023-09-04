package com.Lyambda.escho;

public class Trousers extends Clothing {
    public Trousers(String name, int size) {
        super(name, size);
    }

    @Override
    public void wash() {
        System.out.println("Trousers is cleaned");
    }

    @Override
    public String howToClean() {
        return "with 50 degree";
    }
}
