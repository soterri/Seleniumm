package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

    private static Properties prop;

    /**
     * Reads a properties file from the given path
     */
    public static void readProperties(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the property value for the given key
     */
    public static String getProperty(String key) {
        if (prop == null) {
            throw new IllegalStateException("Properties file not loaded. Call readProperties() first.");
        }
        return prop.getProperty(key);
    }
}
