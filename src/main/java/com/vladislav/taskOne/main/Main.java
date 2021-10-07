package com.vladislav.taskOne.main;

import com.vladislav.taskOne.all_data_writer.WriterToFile;
import com.vladislav.taskOne.parser.Parser;
import com.vladislav.taskOne.reader.Reader;


import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("src\\main\\resources\\numbers.txt");
        Reader reader = new Reader();
        Parser parser = new Parser();

        List<String>abc = reader.read(file);
        double[] a = parser.parse(abc);

        WriterToFile writer = new WriterToFile();
        writer.writeDataAbout(a);
    }
}
