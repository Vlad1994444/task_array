package com.vladislav.taskOne.service.actions;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Average {

    public String averageOfArray(double[] doubles) {
        OptionalDouble aver = Arrays.stream(doubles)
                .average();
        return "Average number in array is "+new DecimalFormat(".##").format(aver.getAsDouble());

    }
}
