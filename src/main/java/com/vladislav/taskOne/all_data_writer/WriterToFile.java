package com.vladislav.taskOne.all_data_writer;

import com.vladislav.taskOne.service.actions.*;
import com.vladislav.taskOne.service.sorting.Sorting;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterToFile {
    public void writeDataAbout(double[] doubles) {

        MinAndMax minAndMax = new MinAndMax();
        GetNumbersBetween_A_And_B change = new GetNumbersBetween_A_And_B();
        Average average = new Average();
        CountOfPositiveAndNegative posNeg = new CountOfPositiveAndNegative();
        Sum sum = new Sum();
        Sorting sorting = new Sorting();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("AllInformationAbout.txt"))) {
            writer.write(minAndMax.findMinAndMax(doubles));
            writer.newLine();
            writer.write(change.change(doubles, 2, 5));
            writer.newLine();
            writer.write(average.averageOfArray(doubles));
            writer.newLine();
            writer.write(posNeg.positiveAndNegative(doubles));
            writer.newLine();
            writer.write(sum.sum(doubles));
            writer.newLine();
            for (String a : sorting.sort(doubles)) {
                writer.write(a);
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
