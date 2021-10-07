package com.vladislav.taskOne.service.sorting;

import java.util.Arrays;

public class SortThirdType {

    public String sort(double[]doubles) {
        double[] arr = Arrays.stream(doubles)
                .sorted()
                .toArray();
        return Arrays.toString(arr);
    }
}
