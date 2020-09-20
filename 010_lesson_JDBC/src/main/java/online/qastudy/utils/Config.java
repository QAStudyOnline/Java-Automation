package online.qastudy.utils;

import java.io.InputStream;
import java.util.Properties;

public final class Config {

    public static final String DB_CONF_FILE = "database.properties";

    public static Properties loadProperties(String propertyFile)  {
        Properties config = new Properties();
        InputStream input;
        try {
            input = Config.class.getClassLoader().getResourceAsStream(propertyFile);
            config.load(input);
        } catch (Exception e) {
        }
        return config;
    }


    public static String getJDBCProp(String propName) {
        return loadProperties(DB_CONF_FILE).getProperty(propName);
    }
}
