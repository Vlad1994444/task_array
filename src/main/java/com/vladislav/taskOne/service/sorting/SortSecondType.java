package com.vladislav.taskOne.service.sorting;

import java.util.Arrays;

public class SortSecondType {
    public String sort(double[]doubles) {
        double temporally;
        for (int i = 0; i < doubles.length; i++) {
            for (int j = i + 1; j < doubles.length; j++) {
                if (doubles[j] < doubles[i]) {
                    temporally = doubles[j];
                    doubles[j] = doubles[i];
                    doubles[i] = temporally;
                }
            }
        }
        return Arrays.toString(doubles);
    }
}
