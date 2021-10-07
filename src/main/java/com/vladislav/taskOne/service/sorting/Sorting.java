package com.vladislav.taskOne.service.sorting;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public List<String> sort(double[] doubles) {

        List<String> res = new ArrayList<>();

        SortFirstType sortOne = new SortFirstType();
        SortSecondType sortTwo = new SortSecondType();
        SortThirdType sortThree = new SortThirdType();

        res.add("First sorting: " + sortOne.sort(doubles));
        res.add("Second sorting: " + sortTwo.sort(doubles));
        res.add("Third sorting: " + sortThree.sort(doubles));

        return res;
    }
}
