package com.nci.automation.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    /*
     * THIS IS A STANDARD CONFIG READER CLASS
     */
    static Properties prop;

    public static Properties readProperties(String filePath){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }
}
