package com.vladislav.taskOne.service.actions;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Sum {

    public String sum(double[] doubles) {
        double sum = Arrays.stream(doubles)
                .sum();
        return "Sum of all numbers in array is equal to " + new DecimalFormat(".##").format(sum);
    }
}
