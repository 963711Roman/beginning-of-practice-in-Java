package com.nakladna;

import java.util.ArrayList;

public class Nackladnaya {
    private double total;
    private String customer;

    private ArrayList<Line> Lines = new ArrayList<Line>();

    //СЕТТЕР І ГЕТТЕР ДЛЯ Customer - ЗАМОВНИК
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public double getTotal() {
        return total;
    }

    //  КОНСТРУКТОР для customer;
    public Nackladnaya(String customer) {
        // super();
        setCustomer(customer);
        //this.customer = customer;
    }

    public Line addLine(String good, double price, int quantity)
    {
        Line L = new Line(good, price, quantity);
        //return new Line(good, price, quantity);
        Lines.add(L);
        return L;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-30s : %8.2f" , getCustomer() , getTotal())).
                append("\n-------------------\n");
        for (Line L : Lines)
            sb.append(L.toString()).append('\n');
        return sb.toString();
    }
    //клас що створює рядки/(стовпчики) накладної
    public class Line


    {

        //good товар
        //quantity кількість;
        private String good;
        private double price;
        private int quantity;
        private double summa;

        private void updateSuma()
        {
            updateSuma(false);
        }
        private void updateSuma(boolean isNew)
        {
            if(! isNew)
                //Nackladnaya.this.total -= suma;
                total -= summa;
            summa = price * quantity;
            //total += summa;
            Nackladnaya.this.total += summa;

        }

        public String getGood() {
            return good;
        }

        public void setGood(String good) {
            this.good = good;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
            updateSuma(false);

        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
            updateSuma(false);
        }

        public double getSumma() {
            return summa;
        }

        private Line(String good, double price, int quantity) {
            setGood(good);
            this.price = price;
            this.quantity = quantity;
            updateSuma(true);
            //Lines.add(this);
        }

        @Override
        public  String toString(){
            return String.format("%-20s %6.2f %4d %7.2f" ,
                    getGood() , getPrice() , getQuantity() , getSumma());
        }


    }
}
