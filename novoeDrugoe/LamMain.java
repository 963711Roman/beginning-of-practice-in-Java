package com.Lyambda.novoeDrugoe;

public class LamMain {
    static  String stringOp(StringFunc f, String val) {
     return  f.func(val);
    }

    public static void main(String[] args) {
        StringFunc ifaceRef = (s) -> s.toUpperCase();
        String result = stringOp(ifaceRef, "Sooooom");
        String result1 = stringOp((s) -> s.toUpperCase(), "Some");
        System.out.println(result);
    }
}
