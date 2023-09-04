package com.nakladna;
public class Nakcladnaya {
    public static void main(String[] args) {
        Nackladnaya inv = new Nackladnaya("РОГИ & КОПИТА");
        //inv.new Line("РОГИ" ,10 , 100);
        inv.addLine("РОГИ" ,10 , 100);
        //inv.new Line("КОПИТА" ,20 , 40);

        //Nackladnaya.Line L2 = inv.new Line("КОПИТА" ,20 , 40);
        Nackladnaya.Line L2 = inv.addLine("КОПИТА" ,20 , 40);
        L2.setPrice(30);
        System.out.println(inv);
        //System.out.println(L2);

    }
}
