package com.vladislav.taskOne.service.actions;

import java.util.Arrays;

public class CountOfPositiveAndNegative {
    public String positiveAndNegative(double[]doubles){

            long positive = Arrays.stream(doubles)
                    .filter((number)->number>0)
                    .count();
            long negative = Arrays.stream(doubles)
                    .filter((number)->number<0)
                    .count();
            return  "Amount of positive numbers - "+positive+". Amount of negative numbers - "+negative;
    }
}
