package com.vladislav.taskOne.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public boolean valid (String stringFromArray){
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(stringFromArray);
        if(matcher.find()){
            return true;
        }
        return false;
    }
}
