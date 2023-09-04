package com.Lyambda.novoeDrugoe.exception;

public class lambdaMain {
    public static void main(String[] args) throws EmptyArrayExeption{
        SomeIface ob = (n) -> {
          if (n.length == 0)
              throw new EmptyArrayExeption();
            return 0;
        };
    }
}
