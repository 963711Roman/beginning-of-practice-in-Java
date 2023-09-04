package com.Lyambda.Function345;
//операція заокруглення
import java.util.function.Function;

public class Function345 {
    public static void main(String[] args) {
        Function<Double, Long> function = d -> Math.round(d);
                System.out.println(function.apply(5.7));
    }
}
