package com.vladislav.taskOne.service.actions;

import java.util.Arrays;

public class GetNumbersBetween_A_And_B {

    public String change(double[] doubles, double a, double b) {

        StringBuilder builder = new StringBuilder();

        double[] arr = Arrays.stream(doubles)
                .filter((number) -> number > a & number < b)
                .toArray();
        for(double num:arr){
            builder.append(num+" ");
        }

        return "Numbers from array between " + a + " and " + b + " : " + builder;
    }
}
