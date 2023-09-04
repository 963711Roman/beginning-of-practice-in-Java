package com.Lyambda.seven.dostyoopkdannym.dostoopkdanim;

public class Main {
    public static void main(String[] args) {
        SimpleClass a = new SimpleClass(new int[] {1, 2, 3});
        Summator sm = a.getSummatorInstans();
        System.out.println(sm.getSum());
       MathUtilite.setArr(new int[] {3, 4, 5});
       System.out.println(MathUtilite.getSummator().getSum());

    }

    public static Summator getIntegerSummator(int[] array){
        Summator sm = () -> {
            int sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += array[i];
            }
            return sum;
        };
        return sm;

    }

}
