package com.vladislav.taskOne.service.actions;

import java.util.Arrays;

public class MinAndMax {

    public String findMinAndMax(double[] doubles) {

        double min = Arrays.stream(doubles)
                .min()
                .getAsDouble();

        double max = Arrays.stream(doubles)
                .max()
                .getAsDouble();
        return "Min value "+min + ", max value "+max;
    }
}
