package online.qastudy.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class Config {

    private Config() {

    }

    public synchronized static Properties loadProperties(String propertyFile) {
        Properties config = new Properties();
        InputStream input;
        try {
            input = Config.class.getClassLoader().getResourceAsStream(propertyFile);
            config.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return config;
    }
}
