package com.Lyambda.graph;

public interface Moveble {
    double DEFAULT_FACTOR = 1D;
    void scale(double factor);

    default void scale() {
        scale(DEFAULT_FACTOR);
    }
}
