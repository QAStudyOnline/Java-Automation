package online.qastudy.utils;

import java.util.Random;

public class TestHelper {

    public static void sleep5Seconds() {
        waitSeconds(5);
    }

    public static void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int randomInt(){
        Random rn = new Random();
        return rn.nextInt();
    }
}
