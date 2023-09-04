package com.Lyambda.escho;

import java.lang.ref.Cleaner;
import java.util.Objects;

public abstract class Clothing implements Cleanable, Comparable<Clothing> {
    public Clothing(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int compareTo(Clothing o) {
        //сортировка по названию
        //в стринга є метод порівняння
        // строк по розміру/довжині

        return this.getName().compareTo(o.getName());
    }

    public abstract void wash();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothing clothing = (Clothing) o;
        return size == clothing.size && name.equals(clothing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", size=" + size ;
    }

    private  String name;
    private int size;

}
