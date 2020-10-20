package online.qastudy.api.utils;

import org.apache.log4j.Logger;

public class Log {

    private static org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(Log.class);

    public static Logger getInstance(){
        return LOG;
    }
}
