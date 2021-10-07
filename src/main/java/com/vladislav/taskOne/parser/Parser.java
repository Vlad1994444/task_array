package com.vladislav.taskOne.parser;

import com.vladislav.taskOne.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Parser {

    private static Logger logger = LogManager.getLogger(Parser.class);

    public double[] parse(List<String> args) throws Exception {
        logger.info("parser work");
        Validator validator = new Validator();
        List<Double> numbers = new ArrayList<>();

        for (String a : args) {
            if (validator.valid(a)) {
                numbers.add(Double.valueOf(a));
            }
        }

        double[] numb = new double[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            numb[i] = numbers.get(i);
        }

        if (numbers.size() >= 2) {
            return numb;
        } else {
            throw new Exception("Parse exception. Little array");
        }
    }
}

