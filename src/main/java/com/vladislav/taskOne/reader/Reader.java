package com.vladislav.taskOne.reader;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private static Logger logger = LogManager.getLogger(Reader.class);

    public List<String> read(File file){
        logger.info("reader starts working");
        List<String>args = new ArrayList<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while((line = reader.readLine())!=null){
                args.add(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return args;
    }
}
