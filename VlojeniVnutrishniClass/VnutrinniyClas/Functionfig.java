package com.VlojeniVnutrishniClass.VnutrinniyClas;
    public  abstract class Functionfig {
        public abstract int funcion(int n);
        public int calculate (int begin, int and){
            return funcion(and) - funcion(begin);
        }
    }

