package com.Lyambda.escho.geometricfigura;

import com.Lyambda.escho.Clothing;

import java.util.Comparator;

public class ClothComparator implements Comparator<Clothing> {
    @Override
    public int compare(Clothing o1, Clothing o2) {
        return o1.getSize() - o2.getSize();
    }
}
