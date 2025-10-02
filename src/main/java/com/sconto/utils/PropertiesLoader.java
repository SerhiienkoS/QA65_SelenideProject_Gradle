package com.sconto.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    private static final String PROF_FILE="/test.properties";
    private PropertiesLoader(){

    }
    public static String loadProperty(String name){
        Properties properties = new Properties();

        try {
            properties.load(PropertiesLoader.class.getResourceAsStream(PROF_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String value  = "";
        if(name !=null){
            value = properties.getProperty(name);
        }
        return value;
    }
}

