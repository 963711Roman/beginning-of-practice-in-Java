package com.Lyambda.anonimniklass;

public class AnotherFood {
    public static void main(String[] args) {
        Potato potato = new Potato(){
          public void fry () {
              System.out.println("ffgf");
          }
          @Override
            public void peel () {
              System.out.println("ffgf");
              fry();
          }
        };

        potato.peel();

    }
}
