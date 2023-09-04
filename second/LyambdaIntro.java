package com.Lyambda.second;

public class LyambdaIntro {
    public static void main(String[] args) {
//створюєм анонімний клас що реалізує danniy функціональний інтерфейс
        Isum sumer = new Isum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        //теж саме токо проще
        Isum sumer3 = (a, b) -> a +b;
            Isum sumer2 = (a, b) -> {
                if (a ==0 ) return 0;
                return a + b;
            };

            ISqrt sqrt = x -> Math.sqrt(x);
            //обмін данними одного типу між функціями однакового
        // типу по входу і виходу
        //так правильніше
        ISqrt sqrt1 = Math::sqrt;
        sqrt1.sqrt(4);
    }
    @FunctionalInterface
    public interface Isum{
        public int sum(int a, int b);
    }
    @FunctionalInterface
    public interface ISqrt{
        public double sqrt(double x);
    }
}
