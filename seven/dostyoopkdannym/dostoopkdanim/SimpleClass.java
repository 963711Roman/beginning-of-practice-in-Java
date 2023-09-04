package com.Lyambda.seven.dostyoopkdannym.dostoopkdanim;

public class SimpleClass {
    private int[] arr;

    private Summator sm = () -> {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    };
    public  SimpleClass(int[] arr) {
        super();
        this.arr = arr;
    }
    public Summator getSummatorInstans() {
        return this.sm;
    }
}
