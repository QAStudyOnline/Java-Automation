package online.qastudy.utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class TestHelper {

    public static void sleep5Seconds() {
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int randomInt(){
        Random rn = new Random();
        return rn.nextInt();
    }

    public static void waitUntilElementWillBeEnabled(WebElement element,
                                                     int iteration,
                                                     Long millisecondToCheck) {
        for (int i = 0; i <=iteration ; i++) {
            try{
                if (element.isEnabled()) break;
            }catch (NoSuchElementException e){
                e.printStackTrace();
            }
            try {
                Thread.sleep(millisecondToCheck);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
