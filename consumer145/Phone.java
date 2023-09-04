package com.Lyambda.consumer145;

import java.util.Arrays;

public class Phone {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Phone.count = count;
    }
public void recervieCall(String name, String number) {
        System.out.println("Calling " + name + "with number" + number);
    System.out.println("My number" + this.number);
}

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    void sedMessages(String message, String... numbers) {
    System.out.println("Massage" + message + "is sending to :" + Arrays.toString(numbers));

}

    private int id;
    private String number;
    private String model;
    private double weight;
    private static int count;
    public Phone (String n, String m, double w){
        this(n, m);
    }
    public Phone (String n, String m) {
        number = n;
        model = m;
        count++;
    }
    public Phone () {count++; }

}
