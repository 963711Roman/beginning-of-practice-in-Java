package com.functsionalnoe.Func;

public class PersonFunc {
    public String name;
    public  int age;
    public PersonFunc(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("%s - %d" , name , age);
    }


}
