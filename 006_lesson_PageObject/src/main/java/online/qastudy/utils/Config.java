package online.qastudy.utils;

import java.io.InputStream;
import java.util.Properties;

public final class Config {

    public static Properties loadProperties(String propertyFile)  {
        Properties config = new Properties();
        InputStream input;
        try {
            input = Config.class.getClassLoader().getResourceAsStream(propertyFile);
            config.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return config;
    }
}
