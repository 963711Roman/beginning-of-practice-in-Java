package com.Lyambda.escho;

public class Loundry {
    public static void clean(Cleanable thing){
        System.out.println(thing.getClass().getSimpleName() +  " " +  "Was cleaned" + thing.howToClean());

    }
}
