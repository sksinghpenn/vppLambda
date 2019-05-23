package com.lifotech.vppMyLambda;

import java.util.Comparator;

/**
 * Created by sksingh on 5/16/17.
 */
public class DesendingComparator implements Comparator<Double> {
    @Override
    public int compare(Double obj1, Double obj2) {

        if (obj1.doubleValue() == obj2.doubleValue()) return 0;
        return (obj1.doubleValue() < obj2.doubleValue() ? -1 : 1);



    }
}
