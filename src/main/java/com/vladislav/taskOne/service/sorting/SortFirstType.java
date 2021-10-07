package com.vladislav.taskOne.service.sorting;

import java.util.Arrays;

public class SortFirstType {

    public String sort(double[]doubles) {

        double[] sorted = Arrays.copyOfRange(doubles, 0, doubles.length);
        Arrays.sort(sorted);

        return Arrays.toString(sorted);
    }
}
